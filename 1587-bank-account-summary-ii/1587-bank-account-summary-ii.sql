
SELECT name, SUM(amount) as BALANCE
FROM Users u
JOIN Transactions t ON
u.account = t.account
GROUP BY u.account
HAVING SUM(amount) > 10000