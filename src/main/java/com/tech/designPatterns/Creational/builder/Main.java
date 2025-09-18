package com.tech.designPatterns.Creational.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("========Builder Design Pattern=======");

        StudentRegistration enggStudent=new StudentRegistration(new EnggStudent());
        StudentRegistration mbaStudent=new StudentRegistration(new MBAStudent());

        Student engStudent=enggStudent.createStudent();
        Student mbStudent=mbaStudent.createStudent();

        System.out.println("====>Student details: "+engStudent);
        System.out.println("====>Student details: "+mbStudent);
    }
}
