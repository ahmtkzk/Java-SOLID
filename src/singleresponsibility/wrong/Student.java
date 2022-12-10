package singleresponsibility.wrong;

/*
* This is wrong, because all operations, whether related with student or not,
* are in the same class. At SOLID's "S", we should separate all different methods
* to related classes.
* */
public class Student {

    private String name;
    private String surName;
    private Integer age;

    public void getDetails(){
        //Method
    }

    public void addStudent(String name, String surName, Integer age){
        //Method
    }

    public void categorizeList(){
        //Method
    }
}
