package com.ncc.enumm;

import java.util.EnumSet;

public class enumSetExample {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public class EnumSetExample {
        public static void main(String[] args) {
            // Tạo một EnumSet từ MONDAY đến FRIDAY
            EnumSet<Day> workDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
            System.out.println("Working days: " + workDays);

            // Thêm SUNDAY vào EnumSet
            EnumSet<Day> allDays = EnumSet.of(Day.SUNDAY);
            allDays.addAll(workDays);
            System.out.println("All days: " + allDays);

            // Loại bỏ SATURDAY khỏi EnumSet
            allDays.remove(Day.SATURDAY);
            System.out.println("All days without Saturday: " + allDays);
        }
    }

}
