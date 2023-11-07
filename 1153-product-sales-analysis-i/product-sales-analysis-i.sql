# Write your MySQL query statement below
select  Product.product_name, Sales.year, Sales.price 
from Product
inner join Sales On Sales.product_id = Product.product_id 
order by Sales.price;