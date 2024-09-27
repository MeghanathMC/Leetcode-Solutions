CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N-1;

 RETURN (
      # Write your MySQL query statement below.
SELECT DISTINCT(Salary) from EMPLOYEE 
order by Salary DESC LIMIT 1 OFFSET N
  );
END

