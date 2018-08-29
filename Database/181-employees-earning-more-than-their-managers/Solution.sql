# Write your MySQL query statement below
SELECT sub.Name AS 'Employee'
    FROM Employee AS sub
        INNER JOIN Employee AS boss
            ON sub.ManagerId = boss.Id
    WHERE sub.Salary > boss.Salary;
    