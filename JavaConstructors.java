package com.pboreg;

public class JavaConstructors {
    int modelYear;
    String modelName;

    public JavaConstructors(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[]args){
        JavaConstructors myCar = new JavaConstructors(1969, "mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
