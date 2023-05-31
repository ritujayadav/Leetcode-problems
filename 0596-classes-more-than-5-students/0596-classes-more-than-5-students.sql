
SELECT class from Courses 
Group by class 
HAVING count(student) >= 5;