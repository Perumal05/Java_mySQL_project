create database BTR;
use BTR;
-- Table for stroing information about the Bus

create table bus(
busNo int primary key,
location varchar(50),
Ac boolean,
capacity int
);
insert into bus values(1,'Madurai -> Chennai',1,20);
insert into bus values(2,'Madurai -> Rameshwaram',0,25);
insert into bus values(3,'Madurai -> coimbatore',1,25);
insert into bus values(4,'Madurai -> Thirunelveli',0,20);

select * from bus;

-- Table for storing information about the Bookings

create table Booking(
passengerName varchar(20),
busNo int,
Travel_date date);

select * from Booking;