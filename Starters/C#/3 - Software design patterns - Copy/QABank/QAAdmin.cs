using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class QAAdmin  // CUT
{
    public bool enrolStudent(int id, IQADatabase db)
    {
        Student stu = db.getStudentByID(id);

        // code to enrol studemt which we want to test

        return true;
    }
}
