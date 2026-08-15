with res as 
(
    select query_name,
    rating/position as score,
    case when rating<3 then 1
    else 0 end as poor_query
    from Queries
)

select query_name,
round(avg(score), 2) as quality,
round(avg(poor_query)*100.0, 2) as poor_query_percentage
from res
group by query_name;