package org.redischool.app.generics.problemtobesolvedbygenerics;

import org.redischool.app.Student;
import org.redischool.app.Teacher;
import org.redischool.app.generics.problemtobesolvedbygenerics.CheckStudenAgeImpl;
import org.redischool.app.generics.problemtobesolvedbygenerics.CheckagestudenInterface;
import org.redischool.app.generics.problemtobesolvedbygenerics.CheckageteacherInterface;
import org.redischool.app.generics.problemtobesolvedbygenerics.CheckteacherImp;

/**
 * Created by raouf on 11/28/16.
 */
public class CheckClassTest {

    public static void main(String [] args){
        Student ahmad=new Student("ahmad",1993);
        Teacher alaa=new Teacher("alla",1992,34);
        CheckagestudenInterface stdentCheck=new CheckStudenAgeImpl();
        CheckageteacherInterface teacherCheck=new CheckteacherImp();

        boolean x=stdentCheck.isStudenAdult(ahmad);
        teacherCheck.isTeacherAdult(alaa);
        System.out.println(teacherCheck.isTeacherAdult(alaa));
        System.out.println(x);

    }
}
