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

        House p1 = new House(200,120, 2, 1);
        Build p2 = new House(300,110,3,1);
        House p3 = new House(120,80,1,1);

        Villa v1 = new Villa(100,90,3,1);
        Villa v2 = new Villa(250,115,3,2);
        Villa v3 = new Villa(400,120,4,1);

        Summery s1 = new Summery(300,70,1,1);
        Summery s2 = new Summery(400,100,2,1);
        Summery s3 = new Summery(600,150,3,1);


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
        System.out.println("Evlerin toplam fiyatı : " +buildService.getTotalPriceOfHouses(builds));
        System.out.println("Villaların toplam fiyatı : " + buildService.getTotalPriceOfVillas(builds));
        System.out.println("Yazlıkların toplam fiyatı : " + buildService.getTotalPriceOfSummeries(builds));
        System.out.println("Tüm konutların toplam fiyatı : " + buildService.getTotalPriceOfBuilds(builds));
        System.out.println("Evlerin toplam metrekaresi : " +buildService.getTotalSquareMetersOfHouses(builds));
        System.out.println("Villaların toplam metrekaresi : " +buildService.getTotalSquareMetersOfVillas(builds));
        System.out.println("Yazlıkların toplam metrekaresi : " +buildService.getTotalSquareMetersOfSummeries(builds));
        System.out.println("Tüm konutların toplam metrekaresi : " +buildService.getTotalSquareMetersOfBuilds(builds));
        System.out.println("2+1 evlerin listesi : " +buildService.filterBuildsByRoomNumAndHallNum(builds, 2,1));
        System.out.println("4+1 evlerin listesi : " +buildService.filterBuildsByRoomNumAndHallNum(builds, 4,1));








    }
}
