-- Last updated: 2/10/2026, 3:14:05 PM
# Write your MySQL query statement below
SELECT 
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
    ON s.product_id = p.product_id;