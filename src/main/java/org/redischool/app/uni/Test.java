package org.redischool.app.uni;

import org.redischool.app.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by raouf on 12/9/16.
 */
public class Test {
    public static void main(String[] args){
        Courses be=new Courses("be","java");
        Courses iot=new Courses("iot","Sisco");
        Courses java=new Courses("java","Sisco");

        List<Courses> ahmadCourses=new ArrayList<Courses>();
        ahmadCourses.add(be);
        ahmadCourses.add(iot);
        List<Courses> aliCourses=new ArrayList<Courses>();
        aliCourses.add(be);
        aliCourses.add(java);

        Student ahmad=new Student("ahmad",ahmadCourses);
        Student ali=new Student("ali",aliCourses);

        List<Student> students= new ArrayList<>();
        students.add(ahmad);
        students.add(ali);
        CourseService x=new CourseService();
        for (Map.Entry<Courses, Integer> entry : x.cunterservices(students).entrySet()) {
            System.out.println("Course " + entry.getKey().getName() + " students " + entry.getValue());
        }



    }

}
