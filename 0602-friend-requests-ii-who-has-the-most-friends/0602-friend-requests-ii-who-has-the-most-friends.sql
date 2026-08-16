select id, count(id) as num
from
(select requester_id as id
from RequestAccepted
union all
select accepter_id as id
from RequestAccepted) as res
group by id
order by num desc
limit 1;