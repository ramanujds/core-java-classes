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

```
