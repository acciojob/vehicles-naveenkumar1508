package com.driver;

public class F1 extends Car {

   // private boolean isManual;
    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"Race car",1);
       // this.isManual = isManual;
    }

    // Getters for F1 class
    @Override
    public String getName() {
        return super.getName();
    }

//    public boolean isManual() {
//        return isManual;
//    }

    public int getCurrentGear() {

        return super.getCurrentGear();
    }

//    public void accelerate(int rate){
//
//        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
//        /**
//         * speed 0: gear 1
//         * speed 1-50: gear 1
//         * speed 51-100: gear 2
//         * speed 101-150: gear 3
//         * speed 151-200: gear 4
//         * speed 201-250: gear 5
//         * speed more than 250: gear 6
//         */
//
//        if(newSpeed == 0) {
//            //Stop the car, set gear as 1
//        }
//        //for all other cases, change the gear accordingly
//
//        if(newSpeed > 0) {
//            changeSpeed(newSpeed, getCurrentDirection());
//        }
//    }
public void accelerate(int rate) {
    int newSpeed = getCurrentSpeed() + rate;
    int newGear = determineGear(newSpeed);

    if (newSpeed <= 0) {
        stop();
    } else {
        changeGear(newGear);
        changeSpeed(newSpeed, getCurrentDirection());
    }
}

    private int determineGear(int speed) {
        if (speed <= 0) {
            return 1;
        } else if (speed <= 50) {
            return 1;
        } else if (speed <= 100) {
            return 2;
        } else if (speed <= 150) {
            return 3;
        } else if (speed <= 200) {
            return 4;
        } else if (speed <= 250) {
            return 5;
        } else {
            return 6;
        }
    }
}
