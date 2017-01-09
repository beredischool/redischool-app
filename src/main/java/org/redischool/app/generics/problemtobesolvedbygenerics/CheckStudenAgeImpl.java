package org.redischool.app.generics.problemtobesolvedbygenerics;

import org.redischool.app.Student;

/**
 * Created by raouf on 11/28/16.
 */
public class CheckStudenAgeImpl implements CheckagestudenInterface {
    public boolean isStudenAdult (Student student){
        if(student.getAge()>=18){
            return true;
        }
        return false;
    }

}
