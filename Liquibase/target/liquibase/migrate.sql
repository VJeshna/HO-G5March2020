-- *********************************************************************
-- Update Database Script
-- *********************************************************************
-- Change Log: src/main/resources/db/changelogs/change-master.xml
-- Ran at: 25/5/20 6:25 AM
-- Against: postgres@jdbc:postgresql://localhost:5432/LiquibaseDemo
-- Liquibase version: 3.6.1
-- *********************************************************************

-- Create Database Lock Table
CREATE TABLE databasechangeloglock (ID INTEGER NOT NULL, LOCKED BOOLEAN NOT NULL, LOCKGRANTED TIMESTAMP WITHOUT TIME ZONE, LOCKEDBY VARCHAR(255), CONSTRAINT DATABASECHANGELOGLOCK_PKEY PRIMARY KEY (ID));

-- Initialize Database Lock Table
DELETE FROM databasechangeloglock;

INSERT INTO databasechangeloglock (ID, LOCKED) VALUES (1, FALSE);

-- Lock Database
UPDATE databasechangeloglock SET LOCKED = TRUE, LOCKEDBY = '192.168.1.102 (192.168.1.102)', LOCKGRANTED = '2020-05-25 06:25:23.715' WHERE ID = 1 AND LOCKED = FALSE;

-- Create Database Change Log Table
CREATE TABLE databasechangelog (ID VARCHAR(255) NOT NULL, AUTHOR VARCHAR(255) NOT NULL, FILENAME VARCHAR(255) NOT NULL, DATEEXECUTED TIMESTAMP WITHOUT TIME ZONE NOT NULL, ORDEREXECUTED INTEGER NOT NULL, EXECTYPE VARCHAR(10) NOT NULL, MD5SUM VARCHAR(35), DESCRIPTION VARCHAR(255), COMMENTS VARCHAR(255), TAG VARCHAR(255), LIQUIBASE VARCHAR(20), CONTEXTS VARCHAR(255), LABELS VARCHAR(255), DEPLOYMENT_ID VARCHAR(10));

-- Changeset src/main/resources/db/changelogs/changelog1.xml::change_1::Vanita
CREATE TABLE "Emp" ("EmpId" INTEGER, "EmpName" VARCHAR(20), "Address" VARCHAR(255));

INSERT INTO databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, DESCRIPTION, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('change_1', 'Vanita', 'src/main/resources/db/changelogs/changelog1.xml', NOW(), 1, '8:1bf57aa0da7f6cae27e2f8cf2b20892a', 'createTable tableName=Emp', '', 'EXECUTED', NULL, NULL, '3.6.1', '0368124256');

-- Changeset src/main/resources/db/changelogs/changelog2.xml::change_2::Vanita
CREATE TABLE "Dept" ("DeptId" INTEGER, "DeptName" VARCHAR(20));

INSERT INTO databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, DESCRIPTION, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('change_2', 'Vanita', 'src/main/resources/db/changelogs/changelog2.xml', NOW(), 2, '8:49e1bcb4bf3e83fc807fed346f934dc2', 'createTable tableName=Dept', '', 'EXECUTED', NULL, NULL, '3.6.1', '0368124256');

-- Changeset src/main/resources/db/changelogs/change-master.xml::change_3::Vanita
INSERT INTO databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, DESCRIPTION, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('change_3', 'Vanita', 'src/main/resources/db/changelogs/change-master.xml', NOW(), 3, '8:d41d8cd98f00b204e9800998ecf8427e', 'empty', '', 'EXECUTED', NULL, NULL, '3.6.1', '0368124256');

-- Release Database Lock
UPDATE databasechangeloglock SET LOCKED = FALSE, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

