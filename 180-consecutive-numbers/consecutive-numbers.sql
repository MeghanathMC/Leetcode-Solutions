# Write your MySQL query statement below

SELECT DISTINCT a.num AS ConsecutiveNums
 from logs a
join logs b on 
a.id=b.id+1 AND a.num=b.num
join logs c on
a.id=c.id+2 AND a.num=c.num;