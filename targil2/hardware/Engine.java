package com.company.hardware;

import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class Engine {

    public String name;
    public int size;
    private double miles;
    private int model_number;
    int number_of_cyl;

    private static final double miles_per_restart = 1_000_000;

    //function:
    public void runEngine(double more_miles) {
        miles += more_miles;
    }

    boolean doesEngineNeedsRestart() {
        return miles > miles_per_restart;
    }



}