CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      with ranked_salary as(Select salary,dense_rank() over(order by salary desc) as rnk from Employee)
      select distinct salary from ranked_salary
      where rnk=N

  );
END