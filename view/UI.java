package de.exceptionex3.view;

import de.exceptionex3.controller.StudentManagement;
import de.exceptionex3.exceptions.ApplicationException;
import de.exceptionex3.exceptions.Logging;
import de.exceptionex3.exceptions.NotYetImplementedException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UI {

    private StudentManagement sm;
    private boolean run;
    private Logger logger;

    public UI(StudentManagement sm){
        this.sm = sm;
        this.run = false;
        this.logger = Logging.getLogger(this.getClass());
    }

    public void start(){
        run = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Herzlich Willkommen zur Verwaltungssoftware");
        while(run){
            System.out.println("##########################");
            System.out.println("# Was möchten Sie tun?");
            System.out.println(" 1 ) Etwas sinnvolles");
            System.out.println(" 2 ) Speichern");
            System.out.println("<?>) Beenden");
            int option = getOption(in);
            switch (option){
                case 1: sthUseful(); break;
                case 2: save(); break;
                default:
                    System.out.println("Programm wird beendet...");
                    run = false;
                    in.close();
            }
        }
        System.out.println("---> THE END <---");
    }

    private int getOption(Scanner in){
        int res = in.nextInt(); //TODO what if this fails?
        return res;
    }

    private void save(){
        try{
            sm.save();
        } catch (ApplicationException e){
            System.out.println("Etwas ist schief gelaufen: "+e.getMessage());
            logger.log(Level.SEVERE, "Ups", e);
        }
    }

    private void sthUseful(){
        throw new NotYetImplementedException();
    }

}
