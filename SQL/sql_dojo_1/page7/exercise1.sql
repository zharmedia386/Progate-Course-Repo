-- get the name and number sold for the top 5 most-sold items
SELECT items.id, items.name, COUNT(*)
FROM items 
JOIN sales_records
ON items.id = sales_records.item_id
GROUP BY items.id
ORDER BY COUNT(*) DESC
LIMIT 5;