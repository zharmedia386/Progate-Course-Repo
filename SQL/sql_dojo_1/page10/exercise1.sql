-- get the specified data for men's, women's, and gender neutral products
SELECT gender, SUM(price) AS "sales total"
FROM items
JOIN sales_records
ON items.id = sales_records.item_id
GROUP BY gender;