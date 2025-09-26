package com.tech.designPatterns.behavioral.Strategy;



    //The Strategy Pattern allows selecting an algorithm's behavior at runtime.
    //Java's Collections.sort() method uses the Strategy Pattern. The method accepts a Comparator, which determines the sorting logic.

    interface TravelStrategy{
        void travel(String from,String to);
    }

    class CarTravel implements TravelStrategy{
        public void travel(String from,String to){
            System.out.println("Travel by Train"+from+"To "+to);
        }
    }
    class TrainTravel implements TravelStrategy{
        public void travel(String from,String to){
            System.out.println("Travel by Train "+from+"To "+to);
        }
    }
    //context

    class TripPlaner{
        private TravelStrategy travelStrategy;
        public TripPlaner(TravelStrategy travelStrategy){
            this.travelStrategy=travelStrategy;
        }

        public void TripPlan(String from,String to){
            travelStrategy.travel(from,to);
        }

        public void setTravelStrategy(TravelStrategy travelStrategy){
            this.travelStrategy=travelStrategy;
        }
    }
public class strategyImpl {
    public static void main(String[] args) {
        TripPlaner tp=new TripPlaner(new CarTravel());
        tp.TripPlan("Home","Airport");
        tp.setTravelStrategy(new TrainTravel());
        tp.TripPlan("Home","Airport");
        //tp.setTravelStrategy(new);

    }
}
