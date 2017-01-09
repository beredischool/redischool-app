package org.redischool.app.generics.genericsInterfaceclasses;

import org.redischool.app.Student;
import org.redischool.app.Teacher;

/**
 * Created by raouf on 11/28/16.
 */
public class GenericsMain {
    public static void main(String [] args){
        Student ahmad=new Student("ahmad",1993);
        Teacher alaa=new Teacher("alla",1992,15);

        // one option
        GenericsCheckAdultImpl a=new GenericsCheckAdultImpl();
        System.out.println(a.checkAdult(ahmad));
        System.out.println(a.checkAdult(alaa));


        // another option
        GenericsCheckInerface<Student> checkstudent = new GenericsCheckAdultImpl<Student>();
        GenericsCheckInerface<Teacher> checkTeacher = new GenericsCheckAdultImpl<Teacher>();


    }
}
