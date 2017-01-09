package org.redischool.app.list;

import java.util.*;

/**
 * Created by raouf on 12/2/16.
         */
public class ListExample {

    public static void main(String... args){
        List<String> myFirstList=new ArrayList<String>();


        for(int counter=0; counter<=1000000; counter++)

        {
            myFirstList.add("A");

        }
        Set<Integer> myFirstSet=new HashSet<Integer>();

        boolean x=myFirstSet.add(1);
        boolean y=myFirstSet.add(1);

        System.out.println(x);
        System.out.println(y);

        System.out.println(myFirstList.size());

        Map<Integer,String> myNewMap=new HashMap<>();
        myNewMap.put(1,"hello");
        myNewMap.put(2,"eat");
        myNewMap.put(3,"go");
        System.out.println(myNewMap.get(2));




    }
}
