create database student_management;
insert into roles values(1,"ADMIN");
insert into roles values(2,"STUDENT");
insert into users values(1,"$2a$12$FTczDhmL2AyB1gZGSgcFh.9AJmxbb2ie9hqRS1NkwFpLkFzuo1.uu","admin1"); /*password 1234*/
insert into users values(2,"$2a$12$FTczDhmL2AyB1gZGSgcFh.9AJmxbb2ie9hqRS1NkwFpLkFzuo1.uu","student1"); /*password 1234*/
insert into users values(3,"$2a$12$FTczDhmL2AyB1gZGSgcFh.9AJmxbb2ie9hqRS1NkwFpLkFzuo1.uu","student2"); /*password 1234*/
insert into user_roles values(1,1);
insert into user_roles values(2,2);
insert into user_roles values(3,2);