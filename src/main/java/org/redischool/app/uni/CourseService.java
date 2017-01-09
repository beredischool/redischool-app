package org.redischool.app.uni;

import org.redischool.app.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by raouf on 12/9/16.
 */
public class CourseService{
    public Map<Courses,Integer> cunterservices(List<Student> students){

        Map<Courses,Integer> coursesResult = new HashMap<>();

        for(Student student : students){

            for (Courses course : student.getCourses()){
                coursesResult.put(course, coursesResult.getOrDefault(course, 0) + 1);
            }
        }
        return coursesResult;
    }

}

