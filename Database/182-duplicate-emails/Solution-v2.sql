SELECT Email FROM (
    SELECT Email, COUNT(Email) AS quantity FROM Person
        GROUP BY Email
        HAVING quantity > 1)
    AS duplicate;