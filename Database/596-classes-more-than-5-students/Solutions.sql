SELECT class as 'class'
  FROM (SELECT DISTINCT * FROM courses) AS u
  GROUP BY class
    HAVING COUNT(class) >= 5;