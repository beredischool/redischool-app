package org.redischool.app.exeptionTests;

/**
 * Created by raouf on 1/9/17.
 */
public class NewStudent {


    private  String name;
    private Integer age;
    public NewStudent(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
