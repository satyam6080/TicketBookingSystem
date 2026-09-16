use  bms;
INSERT INTO cities (id, name, state) VALUES
(1, 'Kanpur', 'Uttar Pradesh'),
(2, 'Lucknow', 'Uttar Pradesh'),
(3, 'Delhi', 'Delhi');

INSERT INTO theaters (id, name, address, city_id) VALUES
(1, 'PVR Cinemas', 'Z Square Mall, Kanpur', 1),
(2, 'INOX', 'South X Mall, Kanpur', 1),
(3, 'PVR Phoenix', 'Phoenix Mall, Lucknow', 2);

INSERT INTO screens (id, name, total_seat, theater_id) VALUES
(1, 'Screen 1', 100, 1),
(2, 'Screen 2', 80, 1),
(3, 'Screen 1', 120, 2),
(4, 'Screen 1', 150, 3);

INSERT INTO seats
(id, seat_number, seat_row, seat_col, seat_type, screen_id)
VALUES
(1, 'A1', 'A', 1, 'Regular', 1),
(2, 'A2', 'A', 2, 'Regular', 1),
(3, 'A3', 'A', 3, 'Regular', 1),
(4, 'B1', 'B', 1, 'Premium', 1),
(5, 'B2', 'B', 2, 'Premium', 1),
(6, 'B3', 'B', 3, 'Premium', 1),

(7, 'A1', 'A', 1, 'Regular', 2),
(8, 'A2', 'A', 2, 'Regular', 2);

INSERT INTO movies
(id, title, language, genre, duration_minutes, rating,
 poster_url, release_date, description)
VALUES
(1, 'Interstellar', 'English', 'Sci-Fi', 169, 8.7,
 'https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg',
 '2014-11-07',
 'A science fiction movie about space and time.'),

(2, '3 Idiots', 'Hindi', 'Comedy', 170, 8.4,
 'https://commons.wikimedia.org/wiki/Special:FilePath/3idiots.jpg',
 '2009-12-25',
 'A story about friendship and engineering students.'),

(3, 'Dangal', 'Hindi', 'Sports', 161, 8.3,
 'https://upload.wikimedia.org/wikipedia/en/9/9a/Dangal_Poster.jpg',
 '2016-12-23',
 'A sports drama based on wrestling.'),
 (4, 'Inception', 'English', 'Sci-Fi', 148, 8.8,
 'https://image.tmdb.org/t/p/w500/oYuLEt3zVCKq57qu2F8dT7NIa6f.jpg',
 '2010-07-16',
 'A skilled thief enters dreams to steal and implant ideas.'),

(5, 'The Dark Knight', 'English', 'Action', 152, 9.0,
 'https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg',
 '2008-07-18',
 'Batman faces a dangerous criminal mastermind known as the Joker.'),

(6, 'Avengers: Endgame', 'English', 'Action', 181, 8.4,
 'https://image.tmdb.org/t/p/w500/or06FN3Dka5tukK1e9sl16pB3iy.jpg',
 '2019-04-26',
 'The Avengers attempt to reverse the destruction caused by Thanos.'),

(7, 'RRR', 'Telugu', 'Action', 182, 8.0,
 'https://image.tmdb.org/t/p/w500/n3dm3Z7d3W3v0x1jXG7v9K3mG0W.jpg',
 '2022-03-25',
 'Two revolutionaries form an unlikely friendship and fight against British rule.'),

(8, 'KGF: Chapter 1', 'Kannada', 'Action', 156, 8.2,
 'https://image.tmdb.org/t/p/w500/ltK3a9f4nY0nYf3R9E6X6mC6Vv.jpg',
 '2018-12-21',
 'A young man rises from poverty to become a powerful figure in a gold mine.'),

(9, 'Baahubali: The Beginning', 'Telugu', 'Action', 159, 8.0,
 'https://image.tmdb.org/t/p/w500/9BAjt8nSSms62uOVYn1t3C3dVBo.jpg',
 '2015-07-10',
 'A young man discovers his royal heritage and a powerful destiny.'),

(10, 'Drishyam', 'Hindi', 'Crime', 163, 8.2,
 'https://image.tmdb.org/t/p/w500/dXj7wX4Hh3L5L7N5R5B7e0N9jK.jpg',
 '2015-07-31',
 'A father goes to great lengths to protect his family from a crime.'),

(11, 'Jawan', 'Hindi', 'Action', 169, 7.0,
 'https://image.tmdb.org/t/p/w500/jF1gZ4sKk6yQnN6rC7wX3hZ7fG.jpg',
 '2023-09-07',
 'A man with a mysterious past takes on corruption and injustice.'),

(12, '12th Fail', 'Hindi', 'Drama', 147, 8.8,
 'https://image.tmdb.org/t/p/w500/7NQZpYHkYH5kB8FQF5C0jQ6D8y.jpg',
 '2023-10-27',
 'A determined student overcomes hardship while preparing for the civil services examination.'),

(13, 'Zindagi Na Milegi Dobara', 'Hindi', 'Drama', 155, 8.2,
 'https://image.tmdb.org/t/p/w500/2k8B0d3LwB6eK4mG7p9W2x3V1Q.jpg',
 '2011-07-15',
 'Three friends take a road trip that changes their perspective on life.');
 
 INSERT INTO users
(id, name, email, password, phone, created_at)
VALUES
(1, 'Satyam Srivastav', 'satyam@gmail.com', 'pass123', '9876543210', NOW()),
(2, 'Rahul Sharma', 'rahul@gmail.com', 'rahul123', '9876543211', NOW()),
(3, 'Aman Verma', 'aman@gmail.com', 'aman123', '9876543212', NOW());

 INSERT INTO shows
(id, movie_id, screen_id, show_date, start_time, end_time, ticket_price)
VALUES
(1, 1, 1, '2026-08-26', '2026-08-26 10:00:00', '2026-08-26 12:49:00', 250.00),
(2, 1, 1, '2026-08-26', '2026-08-26 14:00:00', '2026-08-26 16:49:00', 300.00),
(3, 2, 2, '2026-08-26', '2026-08-26 18:00:00', '2026-08-26 20:50:00', 200.00),
(4, 3, 3, '2026-08-26', '2026-08-26 19:00:00', '2026-08-26 21:41:00', 220.00),
(5, 6, 3, '2026-08-29', '2026-08-29 10:00:00', '2026-08-29 13:01:00', 350.00),

(6, 7, 3, '2026-08-29', '2026-08-29 14:00:00', '2026-08-29 17:02:00', 300.00),

(7, 8, 4, '2026-08-29', '2026-08-29 18:00:00', '2026-08-29 20:36:00', 280.00),

(8, 9, 4, '2026-08-29', '2026-08-29 21:00:00', '2026-08-29 23:39:00', 300.00),

(9, 10, 1, '2026-08-30', '2026-08-30 10:00:00', '2026-08-30 12:43:00', 220.00),

(10, 11, 2, '2026-08-30', '2026-08-30 14:00:00', '2026-08-30 16:49:00', 250.00),

(11, 12, 3, '2026-08-30', '2026-08-30 18:00:00', '2026-08-30 20:27:00', 200.00),

(12, 13, 4, '2026-08-30', '2026-08-30 21:00:00', '2026-08-30 23:35:00', 250.00);
INSERT INTO bookings
(id, user_id, show_id, total_price, status, booked_at)
VALUES
(1, 1, 1, 500.00, 'CONFIRMED', NOW()),
(2, 2, 3, 200.00, 'CONFIRMED', NOW()),
(3, 3, 4, 440.00, 'CONFIRMED', NOW());

INSERT INTO booking_seat (booking_id, seat_id) VALUES
(1, 1),
(1, 2),
(2, 7),
(3, 4),
(3, 5);



