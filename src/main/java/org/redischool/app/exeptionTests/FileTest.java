package org.redischool.app.exeptionTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by raouf on 12/12/16.
 */
public class FileTest {
    public static void main(String []args){
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("");
            int file = inputStream.read();
        }
        catch (FileNotFoundException myfault){
            System.out.println( myfault.getStackTrace());
        }
        catch (IOException newfault){
            newfault.printStackTrace();
        }
        finally {// to close the file...
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
