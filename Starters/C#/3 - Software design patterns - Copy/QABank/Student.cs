using System;
using System.Collections.Generic;
using System.Linq;

public interface IQADatabase
{
    Student getStudentByID(int id);
    List<Student> getStudentsByCity(String city);
}
public class QARealDatabase : IQADatabase
{
    public Student getStudentByID(int id)
    {
        // Code to get data from a read database
        return null;
    }

    public List<Student> getStudentsByCity(string city)
    {
        // Code to get data from a read database
        return null;
    }
}



public class Student
{
    public int ID { get; set; }
    public String City { get; set; }
    public Student(int id, string city)
    {
        this.ID = id;
        this.City = city;
    }
}

