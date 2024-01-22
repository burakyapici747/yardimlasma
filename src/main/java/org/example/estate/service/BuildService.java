package org.example.estate.service;

import org.example.estate.entities.Build;
import org.example.estate.entities.House;
import org.example.estate.entities.Summery;
import org.example.estate.entities.Villa;

import java.util.List;

public interface BuildService {

    public double getTotalPriceOfHouses(List<Build> builds);
    public double getTotalPriceOfVillas(List<Build> builds);
    public double getTotalPriceOfSummeries(List<Build> builds);
    public double getTotalPriceOfBuilds(List<Build> builds);
    public double getTotalSquareMetersOfHouses(List<Build> builds);
    public double getTotalSquareMetersOfVillas(List<Build> builds);
    public double getTotalSquareMetersOfSummeries(List<Build> builds);
    public double getTotalSquareMetersOfBuilds(List<Build> builds);


}
