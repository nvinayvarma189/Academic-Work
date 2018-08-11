create table department505
  (dept_name  varchar(20),
   building   varchar(15),
   budget     numeric(12,2),
   primary key(dept_name));

create table course505
  (course_id  varchar(7),
   title      varchar(50),
   dept_name  varchar(20),   
   credits    numeric(2,0),
   primary key(course_id),
   foreign key(dept_name) references department505);

 create table instructor505
   (ID        varchar(5),
    name      varchar(20) not null,
    dept_name varchar(20),
    salary    numeric(8,2),
    primary key(ID),
    foreign key(dept_name) references department505);

    insert into department505 values ('CSE', 'Amritapuri', 100000);
    insert into department505 values ('ECE', 'Amritapuri', 100000);
    insert into department505 values ('EEE', 'Amritapuri', 100000);
    insert into course505 values ('cse102', 'java', 'CSE',4);
    insert into course505 values ('cse103', 'SQL', 'CSE',4);
    insert into course505 values ('cse104', 'Python', 'CSE',3);
    insert into course505 values ('cse105', 'C#', 'CSE',2);
    	
    insert into department505 values ('Com.Sci','Taylor',100000),('Biology','Watson',90000),
    ('Elec.Eng','Taylor',85000),('Music','Packard',80000),('Finance','Painter',120000),('History','Painter',50000),
    ('Physics','Watson',70000);

    insert into instructor505 values ('22222','Einstein','Physics',95000),('12121','Wu','Finance',90000),
    ('32343','El Said','History',60000),('45565','Katz','Com.Sci',75000),('98345','Kim','Elec.Eng',80000),('76766','Crick','Biology',72000),('10101','Srinivasan','Physics',65000),
    ('58583','Califieri','History',62000),('83821','Brandt','Com.Sci',92000),('15151','Mozart','Music',40000),('33456','Gold','Physics',87000),('76543','Singh','Finance',80000);
      
    insert into course505 values ('BIO-101','Intro. to Biology','Biology',4),('BIO-301','Genetics','Biology',4),('BIO-399','Computational Bioliogy','Biology',3),
    ('CS-101','Intro. to Computer Science','Com.Sci',4), ('CS-190','Game Design','Com.Sci',4), ('CS-315','Robotics','Com.Sci',3), ('CS-319','Image Processing','Com.Sci',3), ('CS-347','Database System Concepts','Com.Sci',3),
    ('EN-181','Intro. to Digital Systems','Elec.Eng',3),('FIN-201','Investment Banking','Finance',3),('HIS-351','World History','History',3),('MU-199','Music Video Production','Music',3),('PHY-101','Physics Principles','Physics',4); 

    alter table instructor505 alter column name type varchar(40);
    alter table instructor505 rename faculty to name;
    Select * from instructor505;
    Select * from course505;
    Select * from department505;
    Select title from course505;
    Select credits=3 from course505;
    Select  credits from course505 where title='java';
    delete from course505 where credits<3;

 CREATE TABLE documents (
	document_id int PRIMARY KEY,
 	header_text VARCHAR (255) NOT NULL,
	posting_date DATE NOT NULL DEFAULT CURRENT_DATE);
	
 CREATE TABLE shifts (
	id int PRIMARY KEY,shift_name VARCHAR NOT NULL,start_at TIME NOT NULL,end_at TIME NOT NULL);

INSERT INTO shifts(id, shift_name, start_at, end_at)
VALUES (1, 'Morning', '08:00:00', '12:00:00'),
(2, 'Afternoon', '13:00:00', '17:00:00'),
(3, 'Night', '18:00:00', '22:00:00');

Create table timestamp_demo(id int, ts timestamp);

INSERT INTO timestamp_demo (id, ts)
VALUES (1,'2016-06-22 19:10:25');

delete from timestamp_demo where id = 1;

Create table product (
	prod_id int primary key,
	prod_name varchar(15),
	price numeric(6,2));

Create table order1(
	order_id int,
	product_id int,
	quantity int,
	primary key(order_id,product_id),
	foreign key (product_id) references product on delete cascade on update cascade);

CREATE TABLE Student1(
		stu_ID int,
		stu_name varchar(20),
		state varchar(20),
		dept_name varchar(20),
		PRIMARY KEY (stu_ID),
		FOREIGN KEY(dept_name) REFERENCES department505 on delete cascade on update cascade);
CREATE TABLE prereq_Course1(
		course_id varchar(10),
		prereq_courseID varchar(10),
		FOREIGN KEY(course_id) REFERENCES course505 on delete cascade on update cascade,
		PRIMARY KEY (prereq_courseID)  );
CREATE TABLE Advisor1(
		stu_Id int,
		ID varchar(5),
		FOREIGN KEY(stu_Id) REFERENCES Student1 on delete cascade on update cascade,
		FOREIGN KEY(ID) REFERENCES instructor505 on delete cascade on update cascade,
		PRIMARY KEY (stu_ID,ID)
		);
CREATE TABLE Register1(
		stu_ID int,
		course_id varchar(10),
		FOREIGN KEY(stu_ID) REFERENCES Student1 on delete cascade on update cascade,
		FOREIGN KEY(course_id) REFERENCES course505 on delete cascade on update cascade,
		PRIMARY KEY(stu_ID,course_id),
		grade varchar(5));

ALTER TABLE Student1 ADD COLUMN tuition_fee numeric(9,2);
ALTER TABLE Student1 ADD COLUMN bus_fee numeric(9,2);

ALTER TABLE Student1 DROP COLUMN bus_fee;

ALTER TABLE Student1
	ALTER COLUMN state TYPE VARCHAR(80),
	ALTER COLUMN stu_name TYPE VARCHAR(30);

ALTER TABLE Student1 ADD CONSTRAINT fee_check check(tuition_fee>0);

alter table Student1 drop constraint fee_check;
alter table Student1 rename column state to stt; 


alter table Student1 rename to student_123;
SELECT * from student_123

ALTER TABLE student_123 ADD COLUMN cgpa float(2);
INSERT into student_123(stu_ID, stu_name, stt, dept_name, tuition_fee, cgpa) VALUES (500,'Vinay','TL','Com.Sci',20,8.4),(506,'srinivas','AP','Com.Sci',300,8.9),(508,'venu','AP','Com.Sci',40,9.8),(255,'pramod','TL','Com.Sci',100,10.0),(254,'ghanta','AP','Com.Sci',60,9.6),(502,'pavan','KL','Com.Sci',80,10.0);
INSERT into student_123(stu_ID, stu_name, stt, dept_name, tuition_fee, cgpa) VALUES (504,'baldo','TN','Com.Sci',30000,8.9);
INSERT into student_123(stu_ID, stu_name, stt, dept_name, tuition_fee, cgpa) VALUES (505,'ronaldo','MH','Com.Sci',50000,6.0);

select * from student_123 where stu_name like 'v%';
select * from student_123 where dept_name='Com.Sci';
select * from student_123 order by stu_name desc;
select * from student_123 order by stu_name,stt desc;
select * from student_123 where stt='KL' and cgpa>8.0;
select * from student_123 where stt='KL' or cgpa>8.0;
select * from student_123 where cgpa>5.0 and cgpa<8.0;
select * from student_123 where stt in ('KL', 'AP', 'TL');
select stu_name as Student_name from student_123;
select MIN(cgpa) as min_cgpa, MAX(cgpa) as max_cgpa FROM student_123;
select SUM(tuition_fee) as total_Tution_fee, AVG(tuition_fee) as average_Tution_fee from student_123;
select count(stu_name) from student_123 where dept_name = 'Com.Sci';
alter table student_123 rename column stu_name to Student_name; 
select Student_name from student_123;
select sum(tuition_fee) from student_123;
select avg(tuition_fee) from student_123;
alter table student_123 add COLUMN bus_fee numeric(9,2);
select bus_fee from student_123;
select stu_id from student_123;
update student_123 set bus_fee = 100;
select sum(tuition_fee+bus_fee) from student_123;

 CREATE TABLE Section(
	course_id VARCHAR (7),
	sec_id VARCHAR (10),
	semester int,
	yea VARCHAR (10),
	building VARCHAR (10),
	room_no int,
	PRIMARY KEY (course_id, sec_id, semester, yea),
	FOREIGN KEY (course_id) references course505);

 CREATE TABLE Teaches(
	ID int,
	course_id VARCHAR (7),
	sec_id VARCHAR (10),
	semester int,
	yea VARCHAR (10),
	PRIMARY KEY (ID, course_id, sec_id, semester, yea),
	FOREIGN KEY (course_id, sec_id, semester, yea) references Section on delete cascade on update cascade);

select count(course_id) from Section where yea='2017';
select DISTINCT(ID) from Teaches where semester = 5 and yea = '2017';
select avg(budget) from department505 where building = 'Painter';
select room_no from Section
	order by course_id asc;
/*select dept_name, max(budget) from department505 order by dept_name;*/

alter table Section add column day varchar(10);  
alter table Section add column start_at  TIME NOT NULL; 
alter table Section add column end_at  TIME NOT NULL;
select * from Section;
insert into Section values('CS-101','cse-c',5,'2017','Watson',301,'Thursday','12:00:00','1:00:00');
insert into Section values('CS-190','cse-b',5,'2017','Watson',302,'Thursday','11:00:00','12:00:00');
select course_id from Section where
start_at<'12:00:00' and day='Thursday' and semester=5 and yea='2017';
select dept_name from instructor505 as ins_10101
	where ID='10101';	
select dept_name || building from department505;
select avg(credits) from course505 where dept_name='Comp.Sci';
select max(salary) from instructor505 as max_salary where dept_name='Comp.Sci';alter table instructor505 add column dateofbirth Date;





