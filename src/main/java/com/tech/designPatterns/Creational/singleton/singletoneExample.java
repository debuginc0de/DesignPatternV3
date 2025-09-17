package com.tech.designPatterns.Creational.singleton;

import lombok.Synchronized;

class singletoneExample {
    static class Singletone{
        private static Singletone single_instance=null;
        //public String s;

        private Singletone() {
            System.out.println("Hello i am a part of the Singletone class");
        }

        public static synchronized Singletone getInstance(){
            if (single_instance==null){
                single_instance=new Singletone();
            }
            return single_instance;
        }
    }
    public static void main(String[] args) {
        Singletone x=Singletone.getInstance();
        Singletone y=Singletone.getInstance();
        Singletone z=Singletone.getInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        if (x==y && y==z){
            System.out.println("same");
        }
        else {
            System.out.println("Not same");
        }



    }

}
