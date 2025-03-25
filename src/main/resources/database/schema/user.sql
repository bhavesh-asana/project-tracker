-- Create the database
CREATE TABLE "user"
(
    user_id      VARCHAR(255) PRIMARY KEY NOT NULL,
    id           INT GENERATED ALWAYS AS IDENTITY,
    first_name   VARCHAR(255)             NOT NULL,
    last_name    VARCHAR(255)             NOT NULL,
    display_name VARCHAR(255),
    email        VARCHAR(255)             NOT NULL,
    organization TEXT[]
);

-- SELECT the database
SELECT * FROM "user";

-- DELETE the database
-- DROP TABLE "user";

INSERT INTO "user" (user_id, first_name, last_name, display_name, email, organization)
VALUES ('vn58f31', 'John', 'Doe', 'John Doe', 'john@gmail.com', ARRAY ['SPE', 'INT']);


