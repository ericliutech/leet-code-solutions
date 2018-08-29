# Write your MySQL query statement below
SELECT today.Id AS 'Id'
    FROM Weather as today
        INNER JOIN Weather as yesterday
            ON DATEDIFF(today.Date, yesterday.Date) = 1
    WHERE today.Temperature > yesterday.Temperature;
    