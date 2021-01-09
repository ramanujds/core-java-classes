## SQL Commands

```sql

use emp_db;
desc dept;
desc emp;
SET @@auto_increment_increment=10;
create table emp(empno int primary key auto_increment, ename varchar(30), salary float, hiredate date, 
					deptno int, constraint fk_deptno foreign key(deptno) references dept(deptno));

alter table emp auto_increment=1001;

insert into dept values(20,'SALES','Delhi');

insert into emp(ename,deptno,phone_no) values('Pritam',10,55475225),('Utkarsh',10,5265623);

alter table emp add phone_no int unique;

update emp set hiredate=now() where hiredate is null;
update emp set salary=salary+1000;
select * from emp;
select * from dept;
delete from emp where empno=1004;
drop table emp;

set autocommit=false;
savepoint p1;
delete from emp;
rollback to p1;
commit;
set autocommit=true;

select * from emp;

select empno, ename from emp;

select distinct deptno from emp;

update emp set deptno=20 where empno>=1006;

select * from emp where deptno=10;

select * from emp where deptno <> 10;

select * from emp where salary is not null;

select * from emp where ename='Tushar' OR ename='Mohit' OR ename='Pritam' OR ename='Harsh';

select * from emp where ename NOT IN('Tushar','Mohit','Harsh','Pritam');

select * from emp where salary>20000 AND hiredate>'2015-12-31';

update emp set salary=40000 where empno=1008;

select * from emp where salary>=30000 AND salary<=40000;

select * from emp where salary NOT between 30000 AND 40000;

SELECT * FROM emp where salary>50000 UNION SELECT * FROM emp WHERE deptno=10;

SELECT salary,empno,ename from emp  where salary>40000 UNION SELECT salary,empId,empName FROM employee where salary>30000;

select empno as "Emp Number", ename as "Employee Name", salary, salary * 12 as "Annual Salary" from emp;

USE EMP;
SHOW TABLES;	

USE EMPLOYEE;
SHOW TABLES;
DESC employee;

CREATE DATABASE emp_ex_db;
use emp_ex_db;
create table dept(  
  deptno     numeric(2,0),  
  dname      varchar(14),  
  loc        varchar(13),  
  constraint pk_dept primary key (deptno)  
);


create table emp(  
  empno    numeric(4,0),  
  ename    varchar(10),  
  job      varchar(9),  
  mgr      numeric(4,0),  
  hiredate date,  
  sal      numeric(7,2),  
  comm     numeric(7,2),  
  deptno   numeric(2,0),  
  constraint pk_emp primary key (empno),  
  constraint fk_deptno foreign key (deptno) references dept (deptno)  
);

insert into DEPT values(10, 'IT', 'KOLKATA');

insert into DEPT values(20, 'SALES', 'MUMBAI');

insert into DEPT values(30, 'ACCOUNTING', 'KOLKATA');

insert into DEPT values(40, 'MANAGEMENT', 'DELHI');

insert into emp  
values(  
 7839, 'KING', 'PRESIDENT', null,  
 '1981-11-17',  
 5000, null, 10  
);

insert into emp  
values(  
 7698, 'BLAKE', 'MANAGER', 7839,  
 '1981-5-1',  
 2850, null, 30  
);

insert into emp  
values(  
 7782, 'CLARK', 'MANAGER', 7839,  
 '1981-6-9',  
 2450, null, 10  
);

insert into emp  
values(  
 7566, 'JONES', 'MANAGER', 7839,  
'1981-4-2',  
 2975, null, 20  
);

insert into emp  
values(  
 7788, 'SCOTT', 'ANALYST', 7566,  
 '1987-4-19',  
 3000, null, 20  
);

insert into emp  
values(  
 7902, 'FORD', 'ANALYST', 7566,  
 '1981-12-3',  
 3000, null, 20  
);

insert into emp  
values(  
 7369, 'SMITH', 'CLERK', 7902,  
 '1980-12-17',  
 800, null, 20  
);

insert into emp  
values(  
 7499, 'ALLEN', 'SALESMAN', 7698,  
 '1981-2-20', 
 1600, 300, 30  
);

insert into emp  
values(  
 7521, 'WARD', 'SALESMAN', 7698,  
 '1981-2-22',  
 1250, 500, 30  
);

insert into emp  
values(  
 7654, 'MARTIN', 'SALESMAN', 7698,  
'1981-9-28',  
 1250, 1400, 30  
);

insert into emp  
values(  
 7844, 'TURNER', 'SALESMAN', 7698,  
'1981-9-8',  
 1500, 0, 30  
);

insert into emp  
values(  
 7876, 'ADAMS', 'CLERK', 7788,  
 '87-5-23',  
 1100, null, 20  
);

insert into emp  
values(  
 7900, 'JAMES', 'CLERK', 7698,  
 '1981-12-3', 
 950, null, 30  
);

insert into emp  
values(  
 7934, 'MILLER', 'CLERK', 7782,  
'1982-1-23',  
 1300, null, 10  
);

select * from emp;


	

```
