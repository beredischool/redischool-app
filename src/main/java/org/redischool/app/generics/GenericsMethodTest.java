package org.redischool.app.generics;

/**
 * Created by raouf on 11/28/16.
 */
public class GenericsMethodTest {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void printIntArray(int[] e){
        for(int i :e){
            System.out.print(i);
        }
        System.out.println();
        System.out.println();
    }

    public static void printStringArray(String[]  stringArray){
        for( String name :stringArray){
            System.out.println(name);
        }
    }

    public static void main (String [] args){
        Integer[] x={12,23,34};
        String[] e={"ahmad","sammer","alla"};

        printArray(x);

        printArray(e);





    }
}
