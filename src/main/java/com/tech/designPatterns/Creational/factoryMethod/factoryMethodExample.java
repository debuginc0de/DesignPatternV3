package com.tech.designPatterns.Creational.factoryMethod;

public class factoryMethodExample {
    public interface Shape{
        public void computeArea();
    }
    public static class square implements Shape{
        @Override
        public void computeArea() {
            System.out.println("Compute square area");
        }
    }
    public static class circle implements Shape{

        @Override
        public void computeArea() {
            System.out.println("Compute circle area");
        }
    }
    public static class rectangular implements Shape{

        @Override
        public void computeArea() {
            System.out.println("Compute rectangular area");
        }
    }
    public static class ShapeFactory{
        public Shape getShapeInstance(String value){
            if (value.equals("circle")){
                return new circle();
            }
            else if (value.equals("rectangular")){
                return new rectangular();
            } else if (value.equals("square")) {
                return new square();
            }
            return null;
        }
    }
    public static void main(String[] args) {
        ShapeFactory sf=new ShapeFactory();
        Shape objs=sf.getShapeInstance("square");
        objs.computeArea();


    }
}
