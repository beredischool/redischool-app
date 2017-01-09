package org.redischool.app.lambdaTestes;
import  org.redischool.app.Person;
import org.redischool.app.Student;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by raouf on 1/6/17.
 */
public class LambdaWithPredicate {
    public static void checkPersonAgeYothWitoutLambda (Person person){
        if(person.getAge() > 18){
            System.out.println("the perosn is Adult");

        }
    }
    public static void checkPersonOldWithoutLambda (Person person){
        if(person.getAge()>60 ){
            System.out.println("is Old");
        }
    }
    public static void checkPersonWithLambda(Person person, Predicate<Person> condition){
        if(condition.test(person) )
            System.out.println(person.getAge());

    }
    public static void checkPersonWithLambdaAndConsumer(Person person, Predicate<Person> condition, Consumer<Person>consumer){
        if(condition.test(person)){
            consumer.accept(person);
        }
    }

    public static void main(String []args){
        Person x=new Student("ahmad",1922);
        checkPersonWithLambda(x,p->p.getAge()<60 );
        checkPersonWithLambda(x,p->p.getAge()>60);
        checkPersonWithLambdaAndConsumer(x,p->p.getAge()>60,t->t.setName("a"));



    }


}
