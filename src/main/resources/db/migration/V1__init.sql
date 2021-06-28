CREATE TABLE students_tbl (
    student_id      bigserial PRIMARY KEY,
    name_fld        VARCHAR(255),
    age_fld         INT
);

INSERT INTO students_tbl (name_fld, age_fld) VALUES
('EGOR', 18),
('STAS', 20),
('VLAD', 19);