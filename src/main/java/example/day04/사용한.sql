drop database if exists springweb;
create database springweb;
use springweb;
create table user(
   id int auto_increment,
    name varchar(100),
    age int ,
    constraint primary key(id)
);

select * from user;

create table day03board(
   bno int auto_increment,
    title varchar(100),
    content longtext,
    constraint primary key(bno)
);

select * from day03board;

create table student(
   sno int auto_increment ,
    name varchar(100) ,
    kor int ,
    math int ,
    constraint primary key( sno )
);

select * from student;