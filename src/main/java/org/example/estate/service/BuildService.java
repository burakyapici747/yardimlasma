package org.example.estate.service;

import org.example.estate.entities.Build;

import java.util.List;

public interface BuildService {

    public double getTotalPriceOfHouses(List<Build> builds);
    public double getTotalPriceOfVillas(List<Build> builds);
    public double getTotalPriceOfSummerys(List<Build> builds);
    public double getTotalPriceOfBuilds(List<Build> builds);


}
