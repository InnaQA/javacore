package com.InnaQA.app.homework.homework15;

public class CustomBicycle  extends Bicycle  {
    @Override
    public void ride() {
        ride();
        System.out.println("Wshhhh!");
    }

    @Override
    public int setSpeed(int speed) {
        return speed;

    }

    @Override
    public int setGear(int gear) {
        return gear;

    }
    public void printSpeed (int speed){
        System.out.println("Speed: "+ speed);
    }
    public void printGear (int gear){
        System.out.println("Gear: " + gear);
    }
}
