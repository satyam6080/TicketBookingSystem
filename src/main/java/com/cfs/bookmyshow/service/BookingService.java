package com.cfs.bookmyshow.service;

import com.cfs.bookmyshow.dto.BookingRequest;
import com.cfs.bookmyshow.entity.Booking;
import com.cfs.bookmyshow.entity.Seat;
import com.cfs.bookmyshow.entity.Show;
import com.cfs.bookmyshow.entity.User;
import com.cfs.bookmyshow.enums.BookingStatus;
import com.cfs.bookmyshow.repository.BookingRepository;
import com.cfs.bookmyshow.repository.SeatRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BookingService {
    private final BookingRepository bookingRepository;
    private final SeatRepository seatRepository;
    private final  UserService userService;
    private final ShowService showService;

    @Transactional
    public Booking createBooking(BookingRequest request){
          User user = userService.getUserById(request.getUserId());
          Show show = showService.getShowById(request.getShowId());

          //check if any requested seat are already book

        List<Long> alreadyBookedSeats= bookingRepository.findBookedSeatIdsByShowId(show.getId());
        for(Long seatId: request.getSeatIds()){
             if(alreadyBookedSeats.contains(seatId)) {
                 throw new RuntimeException("Seat with id " + seatId + " is already booked ");
             }
        }
        List<Seat> seats = seatRepository.findAllById(request.getSeatIds());
        if(seats.size()!=request.getSeatIds().size()){
            throw  new RuntimeException("some seat are invalid ");
        }

        Double totalPrice = seats.size()*show.getTicketPrice();
        Booking booking = Booking.builder()
                .user(user)
                .show(show)
                .seats(seats)
                .totalPrice(totalPrice)
                .status(BookingStatus.CONFIRMED)
                .build();

        return bookingRepository.save(booking);
    }

    public Booking getBookingById(Long id){
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found" +id));
    }

    public List<Booking> getBookingByUser(Long userId){
        return bookingRepository.findByUserId(userId);
    }

    public Booking cancelBooking(long bookingId){
        Booking booking = getBookingById(bookingId);
        booking.setStatus(BookingStatus.CANCELLED);
        return  bookingRepository.save(booking);
    }

    public List<Seat> getAvailableSeats(Long showId){
        Show show = showService.getShowById(showId);
        List<Seat> allSeats= seatRepository.findByScreenId(show.getScreen().getId());
        List<Long> bookingSeatIds = bookingRepository.findBookedSeatIdsByShowId(showId);

        return allSeats.stream()
                .filter(seat -> !bookingSeatIds.contains(seat.getId()))
                .toList();
    }

}
