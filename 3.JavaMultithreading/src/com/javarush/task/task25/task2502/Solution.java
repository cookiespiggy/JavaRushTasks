package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            wheels = new ArrayList<>();
            if (loadWheelNamesFromDB().length != 4) {
                    throw new Exception();
            }
            for (String s : loadWheelNamesFromDB()) {
                wheels.add(Wheel.valueOf(s));
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT", "tj"};
        }
    }

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        System.out.println(car.wheels);
    }
}
