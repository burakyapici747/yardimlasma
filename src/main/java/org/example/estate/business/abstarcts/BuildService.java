package org.example.estate.business.abstarcts;

import org.example.estate.entities.House;
import org.example.estate.entities.Summery;
import org.example.estate.entities.Villa;

import java.util.ArrayList;
import java.util.List;

public interface BuildService {

    List<House> houses = new ArrayList<>();

    List<Villa> villa = new ArrayList<>();

    List<Summery> summery = new ArrayList<>();
}
