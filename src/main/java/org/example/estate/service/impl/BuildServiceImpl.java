package org.example.estate.service.impl;


import org.example.estate.entities.Build;
import org.example.estate.entities.Villa;
import org.example.estate.service.BuildService;

import java.util.List;

public class BuildServiceImpl  implements BuildService {

    @Override
    public double getTotalPriceOfHouses(List<Build> builds) {
        int totalPrice=0;
        for (int i=0; i<builds.size(); i++){
            totalPrice += builds.get(i).getPrice();
        }
        return totalPrice;
    }
    @Override
    public double getTotalPriceOfVillas(List<Build> builds){
        int totalPrice = 0;
        for (int i =0; i<builds.size(); i++){
            totalPrice += builds.get(i).getPrice();
        }
        return totalPrice;
    }
    @Override
    public double getTotalPriceOfSummerys(List<Build> builds){
        int totalPrice=0;
        for (int i =0; i<builds.size(); i++){
            totalPrice += builds.get(i).getPrice();
        }
        return totalPrice;
    }
    @Override
    public double getTotalPriceOfBuilds(List<Build> builds){
        int totalPrice=0;
        for (int i =0; i<builds.size(); i++){
            totalPrice += builds.get(i).getPrice();
        }
        return totalPrice;
    }


}
