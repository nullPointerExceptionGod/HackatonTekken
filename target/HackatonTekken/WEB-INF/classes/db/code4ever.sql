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
INSERT INTO answer(ID, DESCRIPTION) VALUES
    (1, 'Event that can happen during the execution of a program and disrupts it´s normal flow'),
    (2, 'Event that always happen during the execution of a program and disrupts it´s normal flow'),
    (3, 'Event that can happen during the execution of a program but doesn’t disrupts it´s normal flow'),
    (4, 'Event that happen when the program stop his execution'),
    (5, 'Mechanism by which one object acquires all the properties and behavior of another object of another class'),
    (6, 'Mechanism by which one object just acquires the properties of another object of another class'),
    (7, 'Mechanism by which one object just acquires all the behavior of another object of another class'),
    (8, 'When you inherit money from someone who died'),
    (9, 'The process of wrapping data in to a single unit class and keeps data safe from misuse'),
    (10, 'The process of hiding the behaviour of the API from other classes'),
    (11, 'The process of wrapping data in brackets'),
    (12, 'The process of putting a class in a capsule'),
    (13, '”=” attributes value and “==” compares values'),
    (14, '”==” attributes value and “=” compares values'),
    (15, 'both defines value'),
    (16, 'both compares value'),
    (17, 'Both'),
    (18, 'Interpreted'),
    (19, 'Compiled'),
    (20, 'None');