create table Student(
id serial primary key,
name varchar(10) not null,
email varchar(20) unique,
age int,
marks decimal(5,2)
);
insert into student(id,name,email,age,marks) values(1,'Alice','alice@gmail.com',20,90);
insert into student(id,name,email,age,marks) values(2,'Bob','bob@gmail.com',23,60);
insert into student(id,name,email,age,marks) values(3,'Davis','david@gmail.com',24,80);
insert into student(id,name,email,age,marks) values(4,'James','jamesgmail.com',17,75);
select * from student;
select * from student where age>21;
insert into student(id,name,email,age,marks) values(5,'Jhon','jhon@gmail.com',21,70);
update student set email='rahul@gmail.com' where id=5;
delete from student where age<18;
rollback;
select * from student order by marks desc limit 1 offset 1;
--
create table students(
id int primary key,
name varchar(10),
age int
);
create table coursess(
course_id int,
student_id int,
course_name varchar(20),
foreign key(student_id) references students(id)
);
insert into students(id,name,age) values(1,'Rahul',22);
insert into students(id,name,age) values(2,'Priya',21);
insert into students(id,name,age) values(3,'Akash',23);

insert into coursess(course_id,student_id,course_name) values(101,1,'Java');

insert into coursess(course_id,student_id,course_name) values(102,2,'Python');

insert into coursess(course_id,student_id,course_name) values(103,1,'Sql');

select * from coursess;
select * from students;
select s.name,c.course_name from students s inner join coursess c on s.id=c.student_id;







