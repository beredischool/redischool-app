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

        List<Courses> ahmadCourses=new ArrayList<Courses>();
        ahmadCourses.add(be);
        ahmadCourses.add(iot);

        Student ahmad=new Student("ahmad",ahmadCourses);

        List<Student> students= new ArrayList<>();
        students.add(ahmad);
        CourseService x=new CourseService();
        for (Map.Entry<Courses, Integer> entry : x.cunterservices(students).entrySet()) {
            System.out.println("Course " + entry.getKey().getName() + " students " + entry.getValue());
        }



    }

}
