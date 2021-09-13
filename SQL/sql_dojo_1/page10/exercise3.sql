-- get all rows with a higher sales total than the item "grey hoodie"
SELECT items.id, items.name, items.price * COUNT(*) AS "sales total"
FROM items
JOIN sales_records
ON items.id = sales_records.item_id
GROUP BY items.id, items.name, items.price
HAVING (items.price * COUNT(*)) > (
  SELECT items.price * COUNT(*)
  FROM items
  JOIN sales_records
  ON items.id = sales_records.item_id
  WHERE items.name = "grey hoodie"
);