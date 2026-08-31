select department, employee, salary
from
(select d.name as Department, e.name as employee, e.salary,
dense_rank() over(partition by departmentId order by salary desc) as dense_rnk
from Employee e
left join
Department d
on e.departmentId = d.id) as sub_qry
where dense_rnk <= 3;