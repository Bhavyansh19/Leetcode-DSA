select name
from employee
where id in (
    select managerId
    from employee
    where managerId is not null
    group by managerId
    having count(id) >= 5
);