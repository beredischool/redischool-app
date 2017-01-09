package org.redischool.app.generics.genericsInterfaceclasses;

import org.redischool.app.Person;

/**
 * Created by raouf on 11/28/16.
 */
public interface GenericsCheckInerface <T extends Person> {
    public boolean checkAdult(T t);
}
