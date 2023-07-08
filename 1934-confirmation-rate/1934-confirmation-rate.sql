select s.user_id,
round(coalesce(sum(action='confirmed'),0)/count(*),2)
as confirmation_rate
from Signups s 
left join Confirmations c 
on s.user_id=c.user_id
group by
s.user_id;