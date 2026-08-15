With CTE1
as
(
    Select user_id,
    round(SUM(IF(action='confirmed',1,0)*1.0)/count(*),2)
    as confirmation_rate
    from Confirmations
    group by user_id
),
CTE2 as
(Select Signups.user_id, 0 as confirmation_rate
from Signups
left Join Confirmations
on Signups.user_id= confirmations.user_id
where action is null)
Select * from CTE1
union all
Select * from CTE2;