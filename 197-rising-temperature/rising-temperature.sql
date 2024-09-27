# Write your MySQL query statement below

select a.Id
from weather a
join weather b
on DATEDIFF(a.recordDate,b.recordDate)=1
AND a.temperature > b.temperature;