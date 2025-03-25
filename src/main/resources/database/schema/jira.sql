CREATE TABLE "jira" (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    jira_id VARCHAR(255) NOT NULL,
    jira_key VARCHAR(255) NOT NULL,
    created_on DATE,
    ready_for_review_on DATE
)