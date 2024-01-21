package org.example.estate;

import org.example.estate.entities.Build;
import org.example.estate.entities.House;
import org.example.estate.entities.Summery;
import org.example.estate.entities.Villa;
import org.example.estate.service.BuildService;
import org.example.estate.service.impl.BuildServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        House p1 = new House(3,12, 2, 1);
        Build p2 = new House(2,3,6,7);
        House p3 = new House(1,3,6,12);

        Villa v1 = new Villa(1,1,3,1);
        Villa v2 = new Villa(2,4,3,1);
        Villa v3 = new Villa(1,1,4,5);

        Summery s1 = new Summery(1,1,1,1);
        Summery s2 = new Summery(2,2,2,2);
        Summery s3 = new Summery(2,3,1,5);

        List<Build> builds = new ArrayList<>();
        builds.add(p1);
        builds.add(p2);
        builds.add(p3);
        builds.add(v1);
        builds.add(v2);
        builds.add(v3);
        builds.add(s1);
        builds.add(s2);
        builds.add(s3);

        BuildService buildService = new BuildServiceImpl();
        System.out.println(buildService.getTotalPriceOfHouses(builds));







    }
}
