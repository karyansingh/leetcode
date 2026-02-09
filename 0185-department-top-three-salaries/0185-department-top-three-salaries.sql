/* Write your T-SQL query statement below */
/*
SELECT Department, Employee, Salary
FROM(
    SELECT D.name AS Department, E.name AS Employee, E.salary AS Salary,
    DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS d_rank
    FROM Employee E INNER JOIN Department D ON E.departmentId = D.id
) T
WHERE d_rank <= 3;
*/

WITH dept_salary AS (
    SELECT 
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS d_rank
    FROM Employee e
    INNER JOIN Department d 
        ON e.departmentId = d.id
)
SELECT Department,Employee,Salary
FROM dept_salary
WHERE d_rank <= 3;