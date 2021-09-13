-- get the name and number of items for users who have purchased 10 items or more
SELECT users.id,users.name, COUNT(*) AS "number"
FROM users
JOIN sales_records
ON sales_records.user_id = users.id
GROUP BY users.id
HAVING COUNT(*) >= 10