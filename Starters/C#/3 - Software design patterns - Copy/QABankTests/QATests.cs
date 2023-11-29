using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tests
{
    [TestClass()]
    public class QATests
    {
        IQADatabase db;

        [TestInitialize]
        public void setUp()
        {
            db = new QAStubDatabase();
        }

        [TestMethod()]
        public void testEnrolStudent()
        {
            QAAdmin admin = new QAAdmin();
            bool res = admin.enrolStudent(2, db);
            Assert.IsTrue(res);             // Assert
        }
    }
}