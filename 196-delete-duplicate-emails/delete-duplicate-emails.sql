# Write your MySQL query statement below

DELETE s from Person p
join Person s
on p.email=s.email
AND p.id<s.id;
