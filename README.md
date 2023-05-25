# Book_Store_Managment_System

Book Store Management System is a web application to automate all kinds of operations in the bookshop. The purpose of this software was s to manage the books in the book store. Generally, it includes the Order Processing, Stock Management and Accounts Management. We developed this software to maintains records of sales, purchase and staff records. This project developed using ASP.NET as front end and SQL Server as Back end. Here we are try to develop such type system which is provide the automation on the any type of the bookshop. That means a shop which has the type system which provides the facility to the customers of the shop to purchase the books from the shop without any complexity.

using spring boot.
# project-documentation

<p align="center">
  <a href="" rel="noopener">
 <img width=700px height=400px src="https://i.pinimg.com/750x/30/3e/12/303e121466b00ea10b3b843bc8631d83.jpg" alt="Project logo"></a>
</p>
<h3 align="center">BOOK STORE MANAGEMENT SYSTEM</h3>


---

<p align="center">  Easiest way to buy & sell your books.
    <br> 
</p>

## 📝 Table of Contents
- [Abstract](#Abstract)
- [Introduction](#Introduction)
- [Getting Started](#getting_started)
- [Running the file](#file)
- [Electricty Billing System Usage](#electricty_billingsystem_usage)
- [Deployment](#deployment)
- [Flow Chart](#flowchart)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## Abstract <a name = "Abstract"></a>

This application based on the Internet that aims at all levels of management providing information of an organization. This system can be used as an information management system for the bookstore.
Where people can order the books which they want and even they do not need to bother about the location and do not worry about picking it up from the store. This system will help you to get the book from the store to your home with just a single click. We can also make the payment after delivery of the book which will make us feel safe regarding our money.

## Introduction

Book Shop Management System is the computerize application to automate all kinds of activity in book shop. The main aim of this software is to manage the books in the book store.
This software is very helpful for maintain the records of sales and this system keeps all the record of books, receipts, sales, inventory and stocks.

## 🏁 Getting Started <a name = "getting_started"></a>

These instructions will get you to develop the Book Store Management web application using spring boot, Thymeleaf, JPA, h2 database.
Steps to Develop a BSM usng Spring boot.

### Installing

1. Spring initializer
2. Spring tool suit Installation
3. Create a project file in the Spring tool suit
4. Creation of H2 database from Spring tool suit

<B>Spring initializer

A spring initializer is a tool that helps you create a spring project with the desired dependencies and configuration. There are a few ways to use a spring initializer for a maven project:

You can go to https://start.spring.io and let the Initializr generate a Maven project for you with the desired dependencies123. You will get a zip file which you can then unpack in your dev folder. Then open Intellij and select File | New | Project from Existing Sources. (Or Import Project from the welcome screen)4.

You can use IntelliJ Ultimate Edition and create a Spring Boot Maven project directly from Eclipse3. File > New > Project… > Spring Initilzr.
you can add dependencies in the spring initializer itself spring web, thymelef, spring data JPA, MYSQL driver, spring boot dev tools e.t.c.

<B>Spring tool suit Installation

First, need to download the Spring Tool Suite 4 package from the official website https://spring.io/tools. You can choose the package according to your operating system and preferred coding environment (Eclipse, Visual Studio Code, or Theia IDE)1.
Next, you need to copy the downloaded file to the “/opt” folder and unzip it. You can use the following command to move and unzip the file (assuming you are using Linux and Eclipse):
sudo mv spring-tool-suite-4-4.14.0.RELEASE-e4.23.0-linux.gtk.x86_64.tar.gz /opt/
sudo tar -xvzf /opt/spring-tool-suite-4-4.14.0.RELEASE-e4.23.0-linux.gtk.x86_64.tar.gz
Copy
After that, you can run the SpringToolSuite4 application file from the extracted folder to launch STS 423. You will be asked to select a workspace directory where your projects will be stored.
Finally, you can start creating and running Spring Boot projects using STS 4. You can use the Spring Initializr integration to generate a project with the desired dependencies and configuration

<B>Creation of H2 database from Spring tool suit

you can run your Spring Boot application and access the H2 console in your browser by going to http://localhost:8080/h2-console (or http://localhost:8080/h2-console if you are using a different port). You will see a login screen where you can enter the same datasource URL, username and password that you configured in your application.properties file. Then click Connect to connect to your H2 database12.

Finally, you can create tables and perform CRUD operations on your H2 database using SQL scripts or JPA entities. For example, you can create a data.sql file under src/main/resources directory and write some SQL statements to create and populate a table2. Or you can create a JPA entity class with annotations like @Entity, @Id, @Column etc. and let Spring Boot automatically create the table for you based on the entity.


## Running the file <a name = "file"></a>
After completing the project select the file right click it and choose Run.

After that the application will open we can do bill calculationg parts in the new opened window.

we can able to print the bill as three formats

1.Fax

2.word document

3.PDF file.

Its better we choose the file as in PDF format.

### Break down into end to end tests
Explain what these tests test and why


Give an example
## Electricty Billing System Usage <a name = "electricty_billingsystem_usage"></a>
It has three major features.

1.Text field:- In this project there are three main text field. In first one is Customer Id in which we have to fill Customer Id in second one is for Customer Name in this we have to fill customer Name and in the third one is for Unit which is consumed by the customer

2.Cal Button:- Cal Button calculate the gross amount of the unit which consumed by the customer and using lava code it calculate the total bill amount. In this project for different- different unit range there is different rate of charge according to our given data

<<<<<<< HEAD
## 🚀 Deployment <a name = "deployment"></a>
=======
3.Print Button:- In print button it print the all detailed which was shown by the cal button like Customer Id, Customer Name Unit, and Amount etc
>>>>>>> 8b0ac92e1f4c95224da3341a7986336cd1f138e1

<<<<<<< HEAD

## ⛏ Flow Chart <a name = "flowchart"></a>
=======
## Deployment <a name = "deployment"></a>
>>>>>>> 8b0ac92e1f4c95224da3341a7986336cd1f138e1

First Run the file next we get a GUI for calculate the bills and print.
![Screenshot 2023-03-22 171222](https://user-images.githubusercontent.com/127830926/232712556-aab1f0dc-5d13-487c-89a6-c5781e8046b7.png)


## ⛏ Flow Chart <a name = "flowchart"></a>
![Screenshot 2023-04-01 224431](https://user-images.githubusercontent.com/127830926/232712018-223a419d-f21f-4ba8-94f9-37ab3232f2f7.png)


## ✍ Authors <a name = "authors"></a>
- [@Gokulram](https://github.com/GokulRamMani) - FSD

## 🎉 Acknowledgements <a name = "acknowledgement"></a>
- Inspiration
-James Gosling
- References
-Tutus Funny 
