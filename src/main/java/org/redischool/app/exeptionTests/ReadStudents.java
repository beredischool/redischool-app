package org.redischool.app.exeptionTests;

import org.redischool.app.Student;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by raouf on 12/19/16.
 *
 /*

 for (Student student : test.readStudents())
 System.out.println(student.getName() + " " + student.getAge());

 */
public class ReadStudents {

    public List<Student> readStudents() {

        URL resource = this.getClass().getClassLoader().getResource("persons.txt");
        String path = resource.getPath();
        File file = new File(path);
        List<Student> students = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    String[] arr = line.split(",");
                    try {
                        int birthYear = Integer.parseInt(arr[1]);
                        students.add(new Student(arr[0], birthYear));
                    } catch (NumberFormatException e) {

                        continue;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        ReadStudents test = new ReadStudents();

        test.readStudents().forEach(p -> System.out.println(p.getName() + " " + p.getAge()) );
        List<NewStudent> students = test.readStudents().stream().filter(p -> p.getAge() == 18)
                .map(p -> new NewStudent(p.getName(), p.getAge()) ).collect(Collectors.toList());
        students.forEach(p -> System.out.println(p.getName() + " " + p.getAge()) );
     }
}

