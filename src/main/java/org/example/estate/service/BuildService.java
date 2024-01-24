package org.example.estate.service;

import org.example.estate.entities.Build;

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
    public List<Build> filterBuildByRoomAndHall(List<Build> builds, int roomNum, int hallNum);

}
