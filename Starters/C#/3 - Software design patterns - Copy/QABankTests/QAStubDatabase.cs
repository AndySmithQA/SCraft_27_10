using System;
using System.Collections.Generic;
using System.Linq;

public class QAStubDatabase : IQADatabase
{
    List<Student> students = new List<Student>()
        {
            new Student(1,"London"), new Student(2,"Edinburgh"),
            new Student(3,"London"), new Student(4,"Leeds"),
            new Student(11,"Birmingham"), new Student(12,"Bristol"),
            new Student(3,"Bristol"), new Student(4,"Coventry")
        };

    public Student getStudentByID(int id)
    {
        return students.Single(stu => stu.ID == id);
    }

    public List<Student> getStudentsByCity(string city)
    {
        return students.Where(stu => stu.City == city).ToList();
    }
}
