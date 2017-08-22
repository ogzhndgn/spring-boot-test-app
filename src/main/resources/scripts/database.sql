-- Script to create users table in project
CREATE TABLE springboot.users (
  id SERIAL,
  name VARCHAR(64) NOT NULL,
  birthdate DATE,
  city VARCHAR(64),
  CONSTRAINT users_pkey PRIMARY KEY(id)
)
WITH (oids = false);

--Actual data in users table
INSERT INTO users (id, name, birthdate, city) VALUES (1, 'Daniel Gildenlöw', '1973-06-05', 'Eskilstuna');
INSERT INTO users (id, name, birthdate, city) VALUES (3, 'Johan Hallgren', '1975-04-13', 'Eskilstuna');
INSERT INTO users (id, name, birthdate, city) VALUES (4, 'Leo Margarit', '1981-11-01', 'Eskilstuna');
INSERT INTO users (id, name, birthdate, city) VALUES (5, 'Daniel "D2" Karlsson', NULL, 'Eskilstuna');
INSERT INTO users (id, name, birthdate, city) VALUES (6, 'Gustaf Hielm', NULL, 'Eskilstuna');