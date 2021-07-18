CREATE TABLE users
(
    id SERIAL primary key,
    first_name character varying(255) not null,
    last_name character varying(255) not null,
    phone_number character varying(255) not null
);

INSERT INTO users (first_name, last_name, phone_number) VALUES ('Denys', 'Matsenko', '380669410146')