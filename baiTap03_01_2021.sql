CREATE DATABASE Students_PPDIEN
USE Students_PPDIEN
go

CREATE TABLE Science (
    IDSci VARCHAR(100),
    ScienceName VARCHAR(200),
    PRIMARY KEY (IDSci)
);

CREATE TABLE Student (
    IDStud VARCHAR(10),
    Fullname NVARCHAR (100),
    Gender NVARCHAR(10),
    Birthday date,
    IDSci VARCHAR(100) FOREIGN KEY REFERENCES Science(IDSci),
    PRIMARY KEY (IDStud)

);
CREATE TABLE Subjects (
    IDSub VARCHAR(100),
    SubjectName VARCHAR(100),
    NumberLesson INT,
    PRIMARY KEY (IDSub)
);
CREATE TABLE Marks(
    IDStud VARCHAR(10) FOREIGN KEY REFERENCES Student(IDStud),
    IDSub VARCHAR(100) FOREIGN KEY REFERENCES Subjects(IDSub),
    NumberExam INT,
    Marks FLOAT,
    PRIMARY KEY (IDStud, IDSub)
);

-- Insert data
INSERT INTO Science VALUES ('1', 'Mathematics')
INSERT INTO Science VALUES ('2', 'Physics')
INSERT INTO Science VALUES ('3', 'Chemistry')
INSERT INTO Science VALUES ('4', 'Geographics')
INSERT INTO Science VALUES ('5', 'Histories')

INSERT INTO Student VALUES ('STU01', N'Nguyễn Văn An', N'Nam', '04/19/1998', '2')
INSERT INTO Student VALUES ('STU02', N'Trần Dần', N'Nam', '05/23/2001', '4')
INSERT INTO Student VALUES ('STU03', N'Phan Thị Tĩnh', N'Nữ', '09/17/1998', '3')
INSERT INTO Student VALUES ('STU04', N'Nguyễn Khánh Như', N'Nữ', '07/28/1994', '2')
INSERT INTO Student VALUES ('STU05', N'Trần Văn Toàn', 'Nam', '09/12/1996', '1')

INSERT INTO Subjects VALUES ('SUB01', 'Java', 23)
INSERT INTO Subjects VALUES ('SUB02', 'Python', 35)
INSERT INTO Subjects VALUES ('SUB03', 'PHP', 12)
INSERT INTO Subjects VALUES ('SUB04', 'C#', 29)
INSERT INTO Subjects VALUES ('SUB05', 'JavaScript', 22)

INSERT INTO Marks VALUES ('STU01', 'SUB02', 2, 9.5)
INSERT INTO Marks VALUES ('STU02', 'SUB04', 4, 5.6)
INSERT INTO Marks VALUES ('STU03', 'SUB05', 3, 8.7)
INSERT INTO Marks VALUES ('STU04', 'SUB03', 1, 7.5)
INSERT INTO Marks VALUES ('STU05', 'SUB01', 4, 7.9)
GO

CREATE PROC display_all_students
AS
    SELECT * FROM Student
GO

CREATE PROC update_student_info @id VARCHAR(10), @name NVARCHAR(100)
    AS UPDATE Student SET  Fullname = @name WHERE IDStud = @id
GO

CREATE PROC search_id_and_name @id VARCHAR(10), @name NVARCHAR(100)
    AS SELECT * FROM Student WHERE (IDStud = @id AND Fullname = @name)
GO

SELECT * FROM Student

