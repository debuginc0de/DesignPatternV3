package com.tech.designPatterns.Creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder build=new StringBuilder();
        build.append(2).append('a').append("rahul");

        System.out.println(build.toString());

        StringBuffer db=new StringBuffer();
        db.append('b').append("das").append(3);

        System.out.println(db.toString());
    }
}
