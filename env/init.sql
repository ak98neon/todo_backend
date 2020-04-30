create database todo_db_test;

create user dbuser with password 'dbpass';
grant all privileges on database todo_db_test to dbuser;
ALTER USER dbuser WITH SUPERUSER;