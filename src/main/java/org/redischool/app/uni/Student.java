package org.redischool.app.uni;

import java.util.List;

/**
 * Created by raouf on 12/9/16.
 */
public class Student {
    private String name;
    private List<Courses> courses;

    public String getName() {
        return name;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public Student(String name, List<Courses> courses) {

        this.name = name;
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
