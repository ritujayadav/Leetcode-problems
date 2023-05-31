# Write your MySQL query statement below
SELECT class from Courses 
Group by class 
HAVING count(student) >= 5;