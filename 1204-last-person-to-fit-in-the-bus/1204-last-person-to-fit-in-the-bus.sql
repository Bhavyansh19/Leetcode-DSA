select person_name
from
(
    select *, sum(weight) over(order by turn) as running_sum
    from Queue
) sub_query
where running_sum <= 1000
order by turn desc
limit 1;