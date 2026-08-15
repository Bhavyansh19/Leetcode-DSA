with reg_user_count as 
(
    select contest_id,
    count(user_id) as registered_users_counts
    from register
    group by contest_id
),
total_users_counts as 
(select count(*) as total_users from Users)
select contest_id,Round(registered_users_counts*100.0/total_users,2) as percentage from reg_user_count, total_users_counts
order by percentage desc, contest_id;