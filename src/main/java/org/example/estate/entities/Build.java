package org.example.estate.entities;

public class Build {

    private double price;
    private double meterSquare;
    private int roomNum;
    private int hallNum;

    public double getPrice() {
        return price;
    }

    public double getMetersquare() {
        return meterSquare;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getHallNum() {
        return hallNum;
    }

    public Build(double price, double metersquare, int roomNum, int hallNum){
        this.price= price;
        this.meterSquare=meterSquare;
        this.roomNum=roomNum;
        this.hallNum=hallNum;

    }
}
