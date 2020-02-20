create Database HCL_ING;
USE HCL_ING;

CREATE TABLE USER (
    UserID int,
    Name varchar(255),
    Role varchar(255),
    Login_Name varchar(255),
    Login_Pwd varchar(255)
);

Insert into USER values(1,'testuser','CUSTOMER','test_user','user123');
Insert into USER values(2,'adminuser','ADMIN','admin_user','admin123');

CREATE TABLE PRODUCT_GROUP (
    product_group_id int PRIMARY KEY,
    Name varchar(255)
);

Insert into PRODUCT_GROUP values(1,'MORTGAGES');
Insert into PRODUCT_GROUP values(2,'SAVINGS');
Insert into PRODUCT_GROUP values(3,'PAYMENTS');

CREATE TABLE PRODUCT (
    id int PRIMARY KEY,
    Name varchar(255),
	product_group_id int,
	FOREIGN KEY (product_group_id) REFERENCES PRODUCT_GROUP(product_group_id) ON DELETE CASCADE
);

Insert into PRODUCT values(1,'Bank Saving mortgage',1);
Insert into PRODUCT values(2,'Interest-Only',1);
Insert into PRODUCT values(3,'Annuity',1);
Insert into PRODUCT values(4,'Linear',1);
Insert into PRODUCT values(5,'Payments account',3);
Insert into PRODUCT values(6,'Debit card',3);
Insert into PRODUCT values(7,'Quarterly limit',3);
Insert into PRODUCT values(8,'Continuously limit',3);
Insert into PRODUCT values(9,'Orange Savings account',2);
Insert into PRODUCT values(10,'Child Savings account',2);
Insert into PRODUCT values(11,'Savings account for Unicef',2);
Insert into PRODUCT values(12,'Bonus interest account',2);
Insert into PRODUCT values(13,'Savings deposit',2);
Insert into PRODUCT values(14,'Green savings deposit',2);

CREATE TABLE USER_PRODUCT (
    id int PRIMARY KEY,
    pd_id int,
	UserID int
);

insert into USER_PRODUCT values(1,9,1);
insert into USER_PRODUCT values(2,12,1);
insert into USER_PRODUCT values(3,13,1);
insert into USER_PRODUCT values(4,5,1);
insert into USER_PRODUCT values(5,6,1);
insert into USER_PRODUCT values(6,7,1);
insert into USER_PRODUCT values(7,8,1);
insert into USER_PRODUCT values(8,1,1);
insert into USER_PRODUCT values(9,2,1);
insert into USER_PRODUCT values(10,3,1);
insert into USER_PRODUCT values(11,4,1);

CREATE TABLE USER_MORTGAGE (
    id int PRIMARY KEY,
    pd_id int,
	UserID int,
	rate int,
	amount int
);

insert into USER_MORTGAGE values(1,1,1,7,1000);
insert into USER_MORTGAGE values(2,2,1,8,500);
insert into USER_MORTGAGE values(3,3,1,9,1200);
insert into USER_MORTGAGE values(4,4,1,12,300);


CREATE TABLE USER_SAVING (
    id int PRIMARY KEY,
    pd_id int,
	UserID int,
	term int,
	amount int,
	goal varchar(255)
);
insert into USER_SAVING values(1,9,1,2,1000,'Study');
insert into USER_SAVING values(2,10,1,5,10000,'startup');
insert into USER_SAVING values(3,11,1,9,20000,'childeren study');

CREATE TABLE USER_PAYMENTS (
    id int PRIMARY KEY,
    pd_id int,
	UserID int,
	spent_amount int,
	spent_type varchar(255),
	spent_date DATE
);

insert into USER_PAYMENTS values(1,5,1,200,'GROCERY','2020-02-10');
insert into USER_PAYMENTS values(2,6,1,10,10,'Restaurants','2020-02-16');
insert into USER_PAYMENTS values(3,7,1,9,3,'Parking','2020-02-17');
insert into USER_PAYMENTS values(4,8,1,9,40,'Movies','2020-02-19');

CREATE TABLE CLICK_STREAM (
    id int PRIMARY KEY,
    pd_id int,
	UserID int,
	count int
);

insert into CLICK_STREAM values(1,1,1,50);
insert into CLICK_STREAM values(2,2,1,150);
insert into CLICK_STREAM values(3,3,1,20);
insert into CLICK_STREAM values(4,4,1,510);
insert into CLICK_STREAM values(5,5,1,20);
insert into CLICK_STREAM values(6,6,1,530);
insert into CLICK_STREAM values(7,7,1,200);