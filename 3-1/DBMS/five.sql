create table Employee5 (
	employee_id varchar(15), 
	ename varchar(20), 
	date_of_birth date not null, 
	salary numeric(9,2));
drop table Employee5;
insert into Employee5 values ('12345', 'vinay', '1999-09-18', 100000.34);
insert into Employee5 values ('67890', 'varma', '1999-09-26', 100000.67);

select ceil(salary) from Employee5;

select floor(salary) from Employee5;

select round(salary) from Employee5;

select power(salary,2) from Employee5;

select lower(ename) from Employee5;

select ename, length(ename) from Employee5;

select ename, lpad(ename, 15, '*') from Employee5;

select ename, rpad(ename, 15, '*') from Employee5;

select ename, rtrim(ename, ' ' ) from Employee5;

select ename, ltrim(ename, ' ') from Employee5;

select ename, substring(ename from 3 ) from Employee5;

select to_date ('20170312', 'YYYYMMDD') from Employee5;

select to_date ('2017 feb 20', 'YYYY Mon DD');

select extract(month from date_of_birth)=1 as months from Employee5;