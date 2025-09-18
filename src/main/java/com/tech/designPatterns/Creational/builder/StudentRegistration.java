package com.tech.designPatterns.Creational.builder;

public class StudentRegistration {
    StudentBuilder studentBuilder;
    StudentRegistration(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }
    public Student createStudent(){
        if (studentBuilder instanceof EnggStudent) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudent) {
            return createMBAStudent();
        }
        return null;

    }
    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1) // EngineeringStudentBuilder
                .setAge(22)
                .setName("John")
                .setFatherName("Paul")
                .setMotherName("Jane")
                .setBranch("Computer Science and Engineering")
                .setSubjects() // Engineering-specific method
                .build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(2) // MBAStudentBuilder
                .setAge(24)
                .setName("Sarah")
                .setFatherName("Gabriel")
                .setMotherName("Taylor")
                .setBranch("Business Administration")
                .setSubjects() // MBA-specific method
                .setMobileNo("9876543210")
                .setEmailId("sarahgabriel@iitb.com")
                .build();
    }

}
