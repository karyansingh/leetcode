WITH managers AS (
    SELECT e1.id, e1.name, COUNT(e2.managerId) AS manager_count
    FROM Employee e1
    LEFT JOIN Employee e2 ON e1.id = e2.managerId
    GROUP BY e1.id, e1.name
)
SELECT name
FROM managers
WHERE manager_count >= 5;