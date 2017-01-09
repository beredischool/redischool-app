package org.redischool.app.generics.genericsInterfaceclasses;

import org.redischool.app.Person;
import org.redischool.app.Student;

/**
 * Created by raouf on 11/28/16.
 */
public class GenericsCheckAdultImpl<T extends Person> implements GenericsCheckInerface <T> {
    public boolean checkAdult(T t){
        if(t.getAge()>=18){
            return true;
        }
        return false;
    }


}

// public class GenericsImpl implements GenericsCheckInerface<Student>
