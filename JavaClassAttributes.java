package com.pboreg;

public class JavaClassAttributes {
    String fname = "Wahid";
    String lname = "Saputra";
    int age = 20;

    public static void main(String[]args){
        JavaClassAttributes myObj = new JavaClassAttributes();
        System.out.println("Name : "+ myObj.fname + " " + myObj.lname);
        System.out.println("Age : "+ myObj.age);

    }
}
