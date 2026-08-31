select 
case when max(dense_rnk)>1 then salary
else null end
as SecondHighestSalary
from
(select *, 
dense_rank() over(order by salary desc) as dense_rnk
from Employee) as sub_qry
where dense_rnk = 2;