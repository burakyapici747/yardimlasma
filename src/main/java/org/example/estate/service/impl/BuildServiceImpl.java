package org.example.estate.service.impl;


import org.example.estate.entities.Build;
import org.example.estate.entities.House;
import org.example.estate.entities.Summery;
import org.example.estate.entities.Villa;
import org.example.estate.service.BuildService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BuildServiceImpl  implements BuildService {

    @Override
    public double getTotalPriceOfHouses(List<Build> builds) {
        int totalPrice = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof House) {
                totalPrice += builds.get(i).getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public double getTotalPriceOfVillas(List<Build> builds) {
        int totalPrice = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof Villa) {
                totalPrice += builds.get(i).getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public double getTotalPriceOfSummeries(List<Build> builds) {
        int totalPrice = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof Summery) {
                totalPrice += builds.get(i).getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public double getTotalPriceOfBuilds(List<Build> builds) {
        int totalPrice = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof Build) {
                totalPrice += builds.get(i).getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public double getTotalSquareMetersOfHouses(List<Build> builds) {
        int totalSqureMeters = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof House) {
                totalSqureMeters += builds.get(i).getMeterSquare();
            }
        }
        return totalSqureMeters;
    }

    @Override
    public double getTotalSquareMetersOfVillas(List<Build> builds) {
        int totalSquareMeters = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof Villa) {
                totalSquareMeters += builds.get(i).getMeterSquare();
            }
        }
        return totalSquareMeters;
    }

    @Override
    public double getTotalSquareMetersOfSummeries(List<Build> builds) {
        int totalSquareMeters = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof Summery) {
                totalSquareMeters += builds.get(i).getMeterSquare();
            }
        }
        return totalSquareMeters;
    }

    @Override
    public double getTotalSquareMetersOfBuilds(List<Build> builds) {
        int totalSqureMeters = 0;
        for (int i = 0; i < builds.size(); i++) {
            if (builds.get(i) instanceof Build) {
                totalSqureMeters += builds.get(i).getMeterSquare();
            }
        }
        return totalSqureMeters;
    }

    @Override
    public List<Build> filterBuildByRoomAndHall(List<Build> builds, int roomNum, int hallNum) {
        List<Build> filterList = new ArrayList<>();
        for (int i = 0; i< builds.size(); i++){
            if ((builds.get(i).getRoomNum()==roomNum)&&(builds.get(i).getHallNum()==hallNum)){
                filterList.add(builds.get(i));

            }
        }

        return filterList;
    }

}

