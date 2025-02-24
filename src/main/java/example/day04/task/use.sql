drop database if exists db_day04board;
create database db_day04board;
use db_day04board;

create table day04board(
	bno int auto_increment,
    title varchar(100),
    content longtext,
    constraint primary key(bno)
);

select * from day04board;