## SQL Commands

```sql

use emp_db;
desc dept;
desc emp;
SET @@auto_increment_increment=10;
create table emp(empno int primary key auto_increment, ename varchar(30), salary float, hiredate date, 
					deptno int, constraint fk_deptno foreign key(deptno) references dept(deptno));

alter table emp auto_increment=1001;

insert into dept values(10,'IT','Bangalore');

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
select e.empno,ename,d.deptno,location from emp e join dept d on e.deptno=d.deptno where empno=1001 

```
