package de.exceptionex3.controller;

import de.exceptionex3.exceptions.ApplicationException;
import de.exceptionex3.exceptions.NoConnectionToDBException;
import de.exceptionex3.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManagement {

    private List<Student> studentList;

    //varargs
    public StudentManagement(Student ... students){
        studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(students));
    }

    public void printStudents(){
        studentList.forEach(student -> {
            System.out.println(student.getName());
        });
    }

    public void save() throws ApplicationException{
        try{
            for(Student s : studentList) {

                s.saveToDB();
            }
        }catch (NoConnectionToDBException e){
            //Fehler ausgeben
            throw new ApplicationException("SaveError", e);
            //loggen
        }
    }

}
