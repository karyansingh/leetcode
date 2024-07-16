# Write your MySQL query statement below
select e.employee_id
from Employees e
where e.salary<30000 and manager_id not in (select employee_id from employees) order by employee_id