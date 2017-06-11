INSERT INTO USERS (u_id, u_name, u_email, u_key, u_created_at) VALUES ('2', 'Nymeria Ghost', 'nymghost@gmail.com', 'asdfg12345', '2017-05-12');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('2', 'Work', 'NULL', '2016-05-18', '2');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('4','Food', 'aqua', '2017-02-23', '2');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('6', 'School', 'pink','2017-06-15', '2');
INSERT INTO NOTES (n_id, n_b_id, n_checked, n_created_at, n_name, n_content) VALUES ('2', '4', 0,'2017-06-15', 'Grocery Shopping', '[]');
INSERT INTO NOTES (n_id, n_b_id, n_checked, n_created_at, n_name, n_content) VALUES ('3', '6', 1,'2017-06-20', 'Study plan AOP exam', '[]');
INSERT INTO NOTES (n_id, n_b_id, n_checked, n_created_at, n_name, n_content) VALUES ('5', '6', 0,'2017-06-17', 'Study plan DSA exam', '[]');
INSERT INTO NOTES (n_id, n_b_id, n_checked, n_created_at, n_name, n_content) VALUES ('6', '2', 0,'2017-06-21', 'Tasks - 21.06', '[]');