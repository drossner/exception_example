package de.exceptionex3.model;

import de.exceptionex3.exceptions.NoConnectionToDBException;

public class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void saveToDB() throws NoConnectionToDBException{
        //klappt nie..
        throw new NoConnectionToDBException("No connection to DB possible");
    }

    public String getName() {
        return name;
    }
}
