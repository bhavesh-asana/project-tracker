-- Drop Database if exists
DROP TABLE IF  EXISTS codebase;

-- Table: codebase
CREATE TABLE "codebase"(
    branch_name VARCHAR(255) PRIMARY KEY NOT NULL,
    id          INT GENERATED ALWAYS AS IDENTITY,
    pull_request_url VARCHAR(255) NOT NULL
)