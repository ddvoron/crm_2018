CREATE TABLE PERSON (
  ID varchar(100) NOT NULL,
  NAME varchar(45) NOT NULL,
  SURNAME varchar(45) NOT NULL,
  PATRONYMIC varchar(45) DEFAULT NULL,
  EMAIL VARCHAR(45) NOT NULL,
  PASSWORD VARCHAR(100) NOT NULL,
  CREATED TIMESTAMP NOT NULL,
  UPDATED TIMESTAMP NOT NULL,
  PRIMARY KEY (ID)
)