package org.redischool.app.uni;

/**
 * Created by raouf on 12/9/16.
 */
public class Courses {
    private String coursename;
    private String description;

    public void setName(String coursename) {
        this.coursename = coursename;
    }

    public String getName() {
        return coursename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Courses courses = (Courses) o;

        return coursename.equals(courses.coursename);

    }

    @Override
    public int hashCode() {
        return coursename.hashCode();
    }

    public Courses(String coursename, String description) {

        this.coursename = coursename;
        this.description = description;
    }
}
