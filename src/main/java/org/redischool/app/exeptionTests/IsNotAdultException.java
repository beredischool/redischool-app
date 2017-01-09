package org.redischool.app.exeptionTests;

/**
 * Created by raouf on 12/12/16. my own Exception class
 */
public class IsNotAdultException extends Exception {
    private String massage;
    public IsNotAdultException(String massage){
        this.massage=massage;
    }

    public String getMyMassage() {
        return this.massage;
    }
}
