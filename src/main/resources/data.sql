INSERT INTO FILM_CHARACTER (DTYPE, ID, NAME, HOME_PLANET, PRIMARY_FUNCTION) VALUES
    ('Human', 1000, 'Luke Skywalker', 'Tatooine', null),
    ('Human', 1001, 'Darth Vader', 'Tatooine', null),
    ('Human', 1002, 'Han Solo', null, null),
    ('Human', 1003, 'Leia Organa', 'Alderaan', null),
    ('Human', 1004, 'Wilhuff Tarkin', null, null),
    ('Droid', 2000, 'C-3PO', null, 'Protocol'),
    ('Droid', 2001, 'R2-D2', null, 'Astromech');

INSERT INTO CHARACTER_FRIEND (CHARACTER_ID, FRIEND_ID) VALUES
    (1000, 1002),
    (1000, 1003),
    (1000, 2000),
    (1000, 2001),
    (1001, 1004),
    (1002, 1000),
    (1002, 1003),
    (1002, 2001),
    (1003, 1002),
    (1003, 1003),
    (1003, 2000),
    (1003, 2001),
    (1004, 1001),
    (2000, 1000),
    (2000, 1002),
    (2000, 1003),
    (2000, 2001),
    (2001, 1000),
    (2001, 1002),
    (2001, 1003);

INSERT INTO MOVIE_APPEARANCE (FILM_CHARACTER_ID, EPISODE) VALUES
   (1000, 'NEWHOPE'),
   (1000, 'EMPIRE'),
   (1000, 'JEDI'),
   (1001, 'NEWHOPE'),
   (1001, 'EMPIRE'),
   (1001, 'JEDI'),
   (1002, 'NEWHOPE'),
   (1002, 'EMPIRE'),
   (1002, 'JEDI'),
   (1003, 'NEWHOPE'),
   (1003, 'EMPIRE'),
   (1003, 'JEDI'),
   (1004, 'NEWHOPE'),
   (2000, 'NEWHOPE'),
   (2000, 'EMPIRE'),
   (2000, 'JEDI'),
   (2001, 'NEWHOPE'),
   (2001, 'EMPIRE'),
   (2001, 'JEDI');

INSERT INTO CHESS_GAME (ID, PLAYER_WHITE, PLAYER_BLACK, START_DATE) VALUES
    (1, 'KASPAROV', 'KARPOV', DATE '1984-09-09')