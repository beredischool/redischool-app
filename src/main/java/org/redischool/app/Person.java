package org.redischool.app;

import java.util.Calendar;

/**
 * Created by raouf on 11/14/16.
 */
public abstract class Person {
    private String name;

    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - getBirthYear();
    }


    public void move(){
        System.out.println("sasdoooooooooooooo");
    }
}

