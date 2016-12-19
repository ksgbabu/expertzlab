package com.expertzlab.readbook;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.PrintStream;

/**
 * Created by gireeshbabu on 13/12/16.
 */
public class SpecialLogAssociated {

    private PrintStream printStream;

    public void writeLog(String message){
        printStream.println("This is speacial logout ==> "+message);
    }

    @Autowired
    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }
}
