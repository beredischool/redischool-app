package org.redischool.app.exeptionTests;

/**
 * Created by raouf on 12/12/16.
 */
public class ArrayTest {
    public static void main(String []args){
        int []array1=new int[2];
        array1[0]=100;
        array1[1]=2;
        try {

            System.out.println("we want to ");
            int x = array1[2];
            System.out.println("the third value is= " + x);
        }
        catch(ArrayIndexOutOfBoundsException myexeption)
        {
            System.out.println("catched " + myexeption.getStackTrace());

        }

        int y=array1[0];
        System.out.println("int Y is= "+y);



    }
}
