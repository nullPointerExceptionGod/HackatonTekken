DELETE FROM user;
INSERT INTO user(ID, USERNAME) VALUES
    (1, 'Codecadet'),
    (2, 'Andre'),
    (3, 'Paulo');

DELETE FROM question;
INSERT INTO question(ID, DESCRIPTION, DIFFICULTY) VALUES
    (1, 'What is an Exception?', 'MEDIUM'),
    (2, 'What is Inheritance?', 'MEDIUM'),
    (3, 'What is Encapsulation?', 'MEDIUM'),
    (4, 'What is the difference between "=" and "==" in Java?', 'EASY'),
    (5, 'Java is an interpreted or compiled language?', 'EASY');

DELETE FROM answer;
INSERT INTO answer(ID, DESCRIPTION, QUESTION_ID) VALUES
    (1, 'Event that can happen during the execution of a program and disrupts it´s normal flow', 1),
    (2, 'Event that always happen during the execution of a program and disrupts it´s normal flow', 1),
    (3, 'Event that can happen during the execution of a program but doesn’t disrupts it´s normal flow', 1),
    (4, 'Event that happen when the program stop his execution', 1),
    (5, 'Mechanism by which one object acquires all the properties and behavior of another object of another class', 2),
    (6, 'Mechanism by which one object just acquires the properties of another object of another class', 2),
    (7, 'Mechanism by which one object just acquires all the behavior of another object of another class', 2),
    (8, 'When you inherit money from someone who died', 2),
    (9, 'The process of wrapping data in to a single unit class and keeps data safe from misuse', 3),
    (10, 'The process of hiding the behaviour of the API from other classes', 3),
    (11, 'The process of wrapping data in brackets', 3),
    (12, 'The process of putting a class in a capsule', 3),
    (13, '”=” attributes value and “==” compares values', 4),
    (14, '”==” attributes value and “=” compares values', 4),
    (15, 'both defines value', 4),
    (16, 'both compares value', 4),
    (17, 'Both', 5),
    (18, 'Interpreted', 5),
    (19, 'Compiled', 5),
    (20, 'None', 5);