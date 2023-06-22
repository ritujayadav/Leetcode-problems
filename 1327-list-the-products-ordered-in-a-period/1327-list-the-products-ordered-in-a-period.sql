select * from (select product_name, sum(unit) unit
from Products p, Orders o
where o.product_id = p.product_id and month(o.order_date)=2
group by p.product_id) a where unit>=100;