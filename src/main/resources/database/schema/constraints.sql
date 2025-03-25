ALTER TABLE "jira" ADD CONSTRAINT unique_jira_id UNIQUE (jira_id);

ALTER TABLE "user" ADD CONSTRAINT unique_email UNIQUE (email);
ALTER TABLE "user" ADD CONSTRAINT unique_user_id UNIQUE (user_id);

ALTER TABLE "application" ADD CONSTRAINT unique_app_name UNIQUE (app_name);
ALTER TABLE "application" ADD CONSTRAINT unique_github_repo_name UNIQUE (github_repo_name);

ALTER TABLE "codebase" ADD CONSTRAINT unique_branch_name UNIQUE (branch_name);