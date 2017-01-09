package org.redischool.app;

/**
 * Created by raouf on 11/14/16.
 */
public class Teacher extends Person {
    private int number;

    public Teacher(String name, int birthYear,int number) {
        super(name, birthYear);
        this.number= number;
    }
    public void move (){
        System.out.println("aaaaaaaaa");
    }
    public void moa(){
        System.out.println("ana");
    }
}
