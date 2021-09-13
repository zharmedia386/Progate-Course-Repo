-- get the specified data for the top 5 products with the highest sales
SELECT items.id, items.name, items.price * COUNT(*)  AS "sales total"
FROM items
JOIN sales_records
ON sales_records.item_id = items.id
GROUP BY items.id
ORDER BY items.price * COUNT(*) DESC
LIMIT 5;