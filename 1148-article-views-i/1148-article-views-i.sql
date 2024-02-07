# Write your MySQL query statement
SELECT DISTINCT author_id as id
FROM Views
WHERE author_id = viewer_id
ORDER BY viewer_id ASC;
