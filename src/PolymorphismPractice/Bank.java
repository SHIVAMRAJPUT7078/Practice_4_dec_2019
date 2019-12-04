package PolymorphismPractice;

import MultilevelPolymorphism.Animal;

public class Bank {
    protected double getrateOfInterest() {
        return 0;
    }
}
     class ICICIbank extends  Bank{
        public double getrateOfInterest(){
            return 8.0;
        }
    }
     class HDFCbank extends Bank{
        @Override
        public double getrateOfInterest() {
            return 1.0;
        }
    }
     class SBIbank extends Bank{
        public double getrateOfInterest(){
            return 12.0;
        }
    }



class Main{
    public static void main(String[] args) {
        Bank b;
        b = new ICICIbank();
        System.out.println(b.getrateOfInterest());
        b = new HDFCbank();
        System.out.println(b.getrateOfInterest());
        b = new SBIbank();
        System.out.println(b.getrateOfInterest());
    }
}

