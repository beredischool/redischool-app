package service;

import org.redischool.app.Person;

import java.util.List;

/**
 * Created by raouf on 11/18/16.
 */
public interface StatsCalculatorIntf<T extends Person> {
    public float calculateAverageAge(List<T> persons);
}
