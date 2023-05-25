select 
a.name as Employee 
from 
employee a
where a.salary > 
(select salary from employee where id = a.managerid)