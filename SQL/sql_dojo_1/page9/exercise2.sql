-- get the user id and name of unique users who purchased "sandals"
SELECT users.id, users.name
FROM users
JOIN sales_records
ON sales_records.user_id = users.id
WHERE item_id = 18
GROUP BY users.id
ORDER BY users.id ASC