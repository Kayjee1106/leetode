SELECT
    a.student_id,
    a.student_name,
    s.subject_name,
    COUNT(e.student_id) AS attended_exams
FROM
    Students a
CROSS JOIN
    Subjects s
LEFT JOIN
    Examinations e ON a.student_id = e.student_id AND s.subject_name = e.subject_name
GROUP BY
    a.student_id, a.student_name, s.subject_name
ORDER BY
    a.student_id, s.subject_name;
