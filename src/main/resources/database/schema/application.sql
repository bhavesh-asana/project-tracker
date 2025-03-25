-- Drop table if exists
DROP TABLE IF EXISTS application;

-- Table: application
CREATE TABLE "application"
(
    app_name         VARCHAR(255) PRIMARY KEY NOT NULL,
    id               INT GENERATED ALWAYS AS IDENTITY,
    description      TEXT,
    app_type         VARCHAR(255)             NOT NULL,
    organization     TEXT[],
    github_repo_name VARCHAR(255)             NOT NULL,
    github_repo_url  VARCHAR(255)             NOT NULL
);

-- SELECT the database
SELECT *
FROM "application";

-- INSERT INTO the table
INSERT INTO "application" (application_name, description, application_type, organization, github_repo_name,
                           github_repo_url)
VALUES ('my-app', 'This is my app', 'web', ARRAY ['SPE', 'INT'], 'my-app', 'https://www.github.com/'),
       ('my-app-2', 'This is my app 2', 'web', ARRAY ['SPE'], 'my-app-2', 'https://www.github.com/');

-- SELECT the database
SELECT *
FROM "application";