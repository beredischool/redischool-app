package org.redischool.app.exeptionTests;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by raouf on 12/12/16.
 */
public class NullPointerExceptionTest {
    public static void main(String []args){
        Map<String,Integer> stringIntegerMap=new HashMap<>();
        Integer a = stringIntegerMap.put("a", 1);
        try {
            int x=stringIntegerMap.get("b");
        }
        // the famous exeption in Java
        catch (NullPointerException fault){
            fault.printStackTrace();
        }

    }

}
