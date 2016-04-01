create database JavaEEDemo;
use JavaEEDemo;

CREATE TABLE Catalog (
	caid INT not null,
	cadesc varchar(255),
	PRIMARY KEY (caid)
);

CREATE TABLE Publisher (
	pubid INT NOT NULL AUTO_INCREMENT,
	pubname VARCHAR(255),
	pubaddress VARCHAR(255),
	PRIMARY KEY (pubid)
);

create table Author(
	auid int,
	aufullname varchar(255),
	auaddress varchar(255),
	PRIMARY KEY (auid)
);

drop table Book;
CREATE TABLE Book (
	bid VARCHAR(6) NOT NULL,
	isdn varchar(64),
	btitle varchar(255),
	bprice double,
	blanguage varchar(255),
	bsummary varchar(255),
	caid INT,
	pubid INT,
	auid int,
	PRIMARY KEY (bid),
	FOREIGN KEY (caid) REFERENCES Catalog(caid),     
	FOREIGN KEY (pubid) REFERENCES Publisher(pubid),
	FOREIGN KEY (auid) REFERENCES Author(auid)
);


CREATE TABLE Customer (
	cusername VARCHAR(50),
	cpassword VARCHAR(50),
	cfullname VARCHAR(255),
	caddress VARCHAR(255),
	primary key (cusername)
);

CREATE TABLE OrderBook (
	obid INT,
	obdeliveryaddress VARCHAR(255),
	obinvoicedate datetime,
	cusername varchar(20),	
	PRIMARY KEY (obid),
	FOREIGN KEY (cusername) REFERENCES Customer(cusername)
);

drop table OrderDetail;
CREATE TABLE OrderDetail (
	obid INT,
	bid VARCHAR(6),
	quantity INT,	
	PRIMARY KEY (obid,bid),
	FOREIGN KEY (obid) REFERENCES OrderBook(obid),     
	FOREIGN KEY (bid) REFERENCES Book(bid)
);

CREATE TABLE Administrator(
	ausername VARCHAR(50),
	apassword VARCHAR(50),
	aphone varchar(12),
	PRIMARY KEY (ausername)
);

insert into Administrator (ausername,apassword,aphone) values ('admin','admin123','0907118777');

insert into Catalog (caid,cadesc) values (1,'Furniture');
insert into Catalog (caid,cadesc) values (2,'Electronic');

insert into Customer (cusername,cpassword,cfullname,caddress) values ('ltmloan','123456','Le Thi Minh Loan','Can Tho');