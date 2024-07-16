# Write your MySQL query statement below
select employee_id,department_id
from Employee
group by employee_id
having count(employee_id)<2
union
select employee_id,department_id
from employee
where primary_flag='Y';
