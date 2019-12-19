package de.exceptionex3.exceptions;

import java.io.IOException;
import java.util.logging.*;

public class Logging {


    static FileHandler fh;
    static {
        try {
            fh = new FileHandler("#LOG.log");
            fh.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger(Class clazz){
        Logger l = Logger.getLogger(clazz.getName());
        l.setUseParentHandlers(false);
        l.addHandler(fh);
        return l;
    }

}
