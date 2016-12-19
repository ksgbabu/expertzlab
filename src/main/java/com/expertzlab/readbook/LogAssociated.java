package com.expertzlab.readbook;

import java.io.PrintStream;

/**
 * Created by gireeshbabu on 13/12/16.
 */
public class LogAssociated {

    private PrintStream stream;

    public LogAssociated(PrintStream stream){
        this.stream = stream;
    }

    public void writeLog(String message){
        stream.println(message);
    }
}
