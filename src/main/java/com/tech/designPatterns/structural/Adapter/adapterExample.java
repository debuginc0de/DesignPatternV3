package com.tech.designPatterns.structural.Adapter;

//This Pattern act as a bridge b/w 2 incompatible interface.

public class adapterExample {

    public class WeightingMachineImpl implements WeightMachine{
        int weight=0;

        public WeightingMachineImpl(int weightInSource) {
            this.weight = weightInSource;
        }

        @Override
        public int getWeightInPounds() {
            return  weight;
        }

    }

    public class WeightMachineAdapterImpl implements WeightMachineAdapter{
        WeightMachine weightMachine;
        public WeightMachineAdapterImpl(WeightMachine weightMachine){
            this.weightMachine=weightMachine;
        }

        @Override
        public int getWeightInKg() {
            int WeightInPound=weightMachine.getWeightInPounds();
            return WeightInPound*30;
        }
    }

}
