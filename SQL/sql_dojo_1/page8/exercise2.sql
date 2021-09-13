-- get the total sales and the date for each day
SELECT purchased_at, SUM(price) AS "total sales"
FROM sales_records
JOIN items
ON sales_records.item_id = items.id
GROUP BY purchased_at;