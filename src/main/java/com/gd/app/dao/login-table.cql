-- -----------------------------------------------------
-- App keyspace
-- -----------------------------------------------------
CREATE KEYSPACE IF NOT EXISTS app
  WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};

-- -----------------------------------------------------
-- Drop APP keyspace
-- -----------------------------------------------------
-- DROP KEYSPACE IF EXISTS app;
-- -----------------------------------------------------

USE app;

-- -----------------------------------------------------
-- Login table
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS login (
  id text,
  email text,
  name text,
  imageUrl text,
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Check if table is created
-- -----------------------------------------------------
describe tables;

-- -----------------------------------------------------
-- Fetch Details from login table
-- -----------------------------------------------------
SELECT * FROM app.login;