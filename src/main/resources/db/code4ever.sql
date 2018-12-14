DELETE FROM user;
INSERT INTO user(ID, USERNAME) VALUES
    (1, 'Codecadet'),
    (2, 'Andre'),
    (3, 'Paulo');

DELETE FROM question;
INSERT INTO question(ID, DESCRIPTION, DIFFICULTY) VALUES
    (1, 'What is an Exception?', 'medium'),
    (2, 'What is Inheritance?', 'medium'),
    (3, 'What is Encapsulation?', 'medium'),
    (4, 'What is the difference between "=" and "==" in Java?', 'easy'),
    (5, 'Java is an interpreted or compiled language?', 'easy');

DELETE FROM answer;
INSERT INTO answer(ID, DESCRIPTION,VALIDATION, QUESTION_ID) VALUES
    (1, 'Event that can happen during the execution of a program and disrupts it´s normal flow','true', 1),
    (2, 'Event that always happen during the execution of a program and disrupts it´s normal flow','false', 1),
    (3, 'Event that can happen during the execution of a program but doesn’t disrupts it´s normal flow','false', 1),
    (4, 'Event that happen when the program stop his execution','false', 1),
    (5, 'Mechanism by which one object acquires all the properties and behavior of another object of another class','true', 2),
    (6, 'Mechanism by which one object just acquires the properties of another object of another class','false', 2),
    (7, 'Mechanism by which one object just acquires all the behavior of another object of another class','false', 2),
    (8, 'When you inherit money from someone who died','false', 2),
    (9, 'The process of wrapping data in to a single unit class and keeps data safe from misuse','true', 3),
    (10, 'The process of hiding the behaviour of the API from other classes','false', 3),
    (11, 'The process of wrapping data in brackets','false', 3),
    (12, 'The process of putting a class in a capsule','false', 3),
    (13, '= attributes value and == compares values','true', 4),
    (14, '== attributes value and = compares values','false', 4),
    (15, 'both defines value','false', 4),
    (16, 'both compares value','false', 4),
    (17, 'Both','true', 5),
    (18, 'Interpreted','false', 5),
    (19, 'Compiled','false', 5),
    (20, 'None','false', 5);