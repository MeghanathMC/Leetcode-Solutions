# Write your MySQL query statement below

WITH CTE AS
 (SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT 2)


SELECT CASE 
WHEN COUNT(*)<2 THEN NULL
ELSE MIN(Salary)
END AS SecondHighestSalary 
from cte;