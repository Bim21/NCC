package com.ncc.enumm;

import java.util.EnumMap;

public class EnumMapExample {
    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        EnumMap<Color, String> colorMap = new EnumMap<Color, String>(Color.class);
        colorMap.put(Color.RED, "FF0000");
        colorMap.put(Color.GREEN, "00FF00");
        colorMap.put(Color.BLUE, "0000FF");

        System.out.println(colorMap);
        System.out.println("Value of RED: " + colorMap.get(Color.RED));
        System.out.println("Value of GREEN: " + colorMap.get(Color.GREEN));
        System.out.println("Value of BLUE: " + colorMap.get(Color.BLUE));
    }
}

