-- Insert authors
INSERT INTO author (name) VALUES
('J.K. Rowling'),
('George Orwell'),
('Jane Austen');

-- Insert publishers
INSERT INTO publisher (name) VALUES
('Publisher A'),
('Publisher B'),
('Publisher C');

-- Insert books
INSERT INTO book (title, author_id, publisher_id) VALUES
('Book 1', 1, 1),
('Book 2', 1, 2),
('Book 3', 2, 2),
('Book 4', 3, 3);
