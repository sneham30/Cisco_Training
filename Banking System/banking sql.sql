create table Customers(customerNumber int,customerName varchar(25) not null,address varchar(95),password varchar(30), CONSTRAINT pk_customerName PRIMARY KEY (customerName))


drop table Customers

create table Accounts(accountNumber int,accountHolderName varchar(25),accountType varchar(10),balance int,FOREIGN KEY (accountHolderName) REFERENCES Customers(customerName),CONSTRAINT pk_accountNumber PRIMARY KEY (accountNumber ))