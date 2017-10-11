DELETE FROM user_roles;
DELETE FROM desires;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password');

INSERT INTO users (name, email, password)
VALUES ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 100000),
  ('ROLE_ADMIN', 100001);

INSERT INTO desires (date_time, description, barter, categories, user_id) VALUES
  ('2015-05-30 10:00:00', 'пуnjkпку', '34е43', '34е43е', 100000),
  ('2015-05-30 13:00:00', 'Need something', 'I can do this for you', 'Desire', 100000),
  ('2015-05-30 20:00:00', 'Need something', 'I can do this for you', 'Categories', 100000),
  ('2015-05-31 10:00:00', 'Need something', 'I can do this for you', 'Categories', 100000),
  ('2015-05-31 13:00:00', 'Need something', 'I can do this for you', 'Categories', 100000),
  ('2015-05-31 20:00:00', 'Need something', 'I can do this for you', 'Categories', 100000),
  ('2015-06-01 14:00:00', 'Need something', 'I can do this for you', 'Categories', 100001),
  ('2015-06-01 21:00:00', 'Need something', 'I can do this for you', 'Categories', 100001);

