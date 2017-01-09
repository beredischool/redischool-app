package org.redischool.app.generics.problemtobesolvedbygenerics;

import org.redischool.app.Teacher;

/**
 * Created by raouf on 11/28/16.
 */
public class CheckteacherImp implements CheckageteacherInterface {
    public boolean isTeacherAdult (Teacher teacher){
            if(teacher.getAge()>=18){
                return true;
            }
            return false;
    }
}
