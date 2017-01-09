package org.redischool.app;

import service.StatsCalculator;
import service.StudentsStatsCalculator;

import java.util.*;

/**
 * Created by avramesc on 10/31/2016.
 */
public class Main {

    public static void main(String[] args) {



       StatsCalculator<Student> studentsStatsCalculator= new StudentsStatsCalculator();

        Student stundent = new Student("George", 1978);
        Teacher teacher  = new Teacher("fxccc",1990,55);


        List<Student> students = new ArrayList();
        students.add(stundent);
        studentsStatsCalculator.calculateAverageAge(students);





    }
}
