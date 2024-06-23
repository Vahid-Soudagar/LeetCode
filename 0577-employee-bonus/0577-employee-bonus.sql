# Write your MySQL query statement below


-- name and bonus amount
-- greater than 1000

select name, bonus 
from employee e 
left join bonus b on e.empId = b.empId
where b.bonus < 1000 or b.bonus is null;