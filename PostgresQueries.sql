-- 11) Find all the employees whose job is either a president or manager.
select empno, ename, job from emp where job in('PRESIDENT','MANAGER');

-- 12) Find all managers who are not in dept 30.
select empno, ename, job, deptno from emp where job in ('MANAGER') and deptno <> 30;

-- 13) Find the details of all managers and clerks in dept 10.
select empno, ename, job, deptno from emp where job in ('MANAGER','CLERK') and deptno = 10;

-- 14) Find the details of all manager (in any dept) and all clerks in dept 10
select empno, ename, job, deptno from emp where job = 'MANAGER' or job='CLERK' and deptno = 10;

-- 15) Find the details of all managers in dept 10 and all clerks in dept 20.
select empno, ename, job, deptno from emp where (job = 'MANAGER' and deptno = 10) OR
(job='CLERK' and deptno = 20);

-- 16) Find the details of all the manager in dept 10, all clerk in dept 20 
select empno, ename, job, deptno from emp where (job = 'MANAGER' and deptno = 10) OR
(job='CLERK' and deptno = 20);

-- 17) And all employees who are neither clerks nor manager but whose salary is greater than or 
equal to Rs. 2000.
select empno, ename, job, deptno, sal from emp where job not in ('CLERK', 'MANAGER') and sal >= 2000;

-- 18) Find the names of everyone in deptno 20 who is neither a clerk nor a Manager. 
select empno, ename, job, deptno from emp where deptno = 20 and job not in ('CLERK', 'MANAGER');

-- 19) Find the employees who earns between Rs. 1200 and Rs.1400.
select empno, ename, sal from emp where sal between 1200 and 1400 ;

-- 20) Find the employees who are clerks, analysts or salesman.
select empno, ename, job from emp where job in ('CLERK', 'ANALYST', 'SALESMAN');