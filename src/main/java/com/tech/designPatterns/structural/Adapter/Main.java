package com.tech.designPatterns.structural.Adapter;

public class Main {
    public static void main(String[] args) {
        int weightINSource=20;
        adapterExample.WeightingMachineImpl imperialWeighingMachine = new adapterExample.WeightingMachineImpl(weightINSource);
        adapterExample.WeightMachineAdapterImpl we=new adapterExample.WeightMachineAdapterImpl(imperialWeighingMachine);
        System.out.println(we.getWeightInKg());

    }
}
