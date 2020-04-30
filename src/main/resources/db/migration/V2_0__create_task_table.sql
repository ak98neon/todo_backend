DROP TABLE IF EXISTS task CASCADE;
CREATE TABLE task
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(60) NOT NULL,
    description VARCHAR(128),
    date        DATE NOT NULL,
    created_at  DATE NOT NULL,
    updated_at  DATE
);
