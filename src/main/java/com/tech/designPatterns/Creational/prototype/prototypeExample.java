package com.tech.designPatterns.Creational.prototype;

public class prototypeExample {
    public interface Prototype{
        Prototype clone();
        void shown();
    }
    public static class Student implements Prototype{
        int age;
        private int roll_no;
        String name;

        Student(){

        }
        Student(int age,int roll_no,String name){
            this.age=age;
            this.roll_no=roll_no;
            this.name=name;
        }
        @Override
        public Prototype clone(){

            return new Student(age,roll_no,name);
        }

        @Override
        public void shown() {
            System.out.println("My age is " + age + " roll no "+roll_no+" and name "+name);
        }
    }
    public static void main(String[] args) {
        Student obj=new Student(21,101,"rahul das");
        Student clone_obj=(Student) obj.clone();
        obj.shown();
        clone_obj.shown();

    }
}
