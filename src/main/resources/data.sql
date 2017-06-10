INSERT INTO USERS (u_id, u_name, u_email, u_key, u_created_at) VALUES ('2', 'Nymeria Ghost', 'nymghost@gmail.com', 'asdfg12345', '2017-05-12');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('2', 'Work', 'red', '2016-05-18', '2');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('4','Food', 'green', '2017-02-23', '2');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('6', 'School', 'pink','2017-06-15', '2');
INSERT INTO NOTES (n_id, n_b_id, n_checked, n_created_at, n_name, n_content) VALUES ('2', '4', 0,'2017-06-15', 'Grocery Shopping', '[]');