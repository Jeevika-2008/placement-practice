SELECT DISTINCT s1.*
FROM Stadium s1
JOIN Stadium s2
ON s1.id BETWEEN s2.id AND s2.id + 2
WHERE s1.people >= 100
AND s2.people >= 100
AND EXISTS (
    SELECT 1
    FROM Stadium s3
    WHERE s3.id = s2.id + 1
    AND s3.people >= 100
)
AND EXISTS (
    SELECT 1
    FROM Stadium s4
    WHERE s4.id = s2.id + 2
    AND s4.people >= 100
)
ORDER BY s1.visit_date;
