package org.redischool.app.exeptionTests;
import org.redischool.app.Student;

import org.redischool.app.exeptionTests.IsNotAdultException;

import java.util.List;

/**
 * Created by raouf on 1/6/17.
 */

public class ThrowTest {

    public void checkstudents (List<Student> students){
        try {

            middlestep(students);
        }
        catch (IsNotAdultException exp) {
            System.out.print(exp.getMyMassage());
        }
    }
    private void middlestep (List<Student>students) throws IsNotAdultException{
        for(Student x : students){
            checkAge(x);

        }
    }
    private void checkAge (Student student) throws IsNotAdultException {
        if(student.getAge()<18){
            throw new IsNotAdultException("is not Adult"+student.getAge());
        }
    }
}

