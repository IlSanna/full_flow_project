-- Insert users
INSERT INTO users (id, user_name) VALUES (1, 'john_doe');
INSERT INTO users (id, user_name) VALUES (2, 'jane_smith');

-- Insert tasks for john_doe
INSERT INTO tasks (id, state, description, user_id) VALUES (1, 'TODO', 'Complete project documentation', 1);
INSERT INTO tasks (id, state, description, user_id) VALUES (2, 'IN_PROGRESS', 'Implement feature X', 1);
INSERT INTO tasks (id, state, description, user_id) VALUES (3, 'VALIDATION', 'Fix bug Y', 1);

-- Insert tasks for jane_smith
INSERT INTO tasks (id, state, description, user_id) VALUES (4, 'TODO', 'Write unit tests', 2);
INSERT INTO tasks (id, state, description, user_id) VALUES (5, 'IN_PROGRESS', 'Design UI', 2);
INSERT INTO tasks (id, state, description, user_id) VALUES (6, 'VALIDATION', 'Refactor old code', 2);
INSERT INTO tasks (id, state, description, user_id) VALUES (7, 'DONE', 'Deploy application', 2);
