package service;

import org.redischool.app.Person;

import java.util.List;

/**
 * Created by raouf on 11/14/16.
 */
public abstract class StatsCalculator<T extends Person> {

    public float calculateAverageAge(List<T> persons) {
        int size= persons.size();

        float sumAge=0;
        for (T person: persons){
            sumAge += person.getAge();
        }

        return sumAge/size;
    }

}
