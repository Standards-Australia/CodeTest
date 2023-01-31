package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Main {
    public static String strStart1 = "03/05/2020 19:00";
    public static String strStart2 = "03/05/2020 22:10";
    public static String strStart3 = "03/05/2020 20:30";

    public static String strEnd1 = "03/05/2020 20:30";
    public static String strEnd2 = "03/05/2020 22:30";
    public static String strEnd3 = "03/05/2020 22:00";
    public static SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");
    public static ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();

    public static void main(String[] args) throws ParseException {

        if (!(sdf.parse(strEnd1)).before(sdf.parse(strStart1))) {
            rentalTimes.add(new RentalTime(sdf.parse(strStart1), sdf.parse(strEnd1)));
            System.out.println(CarRental.canScheduleAll(rentalTimes));
        }
        if (!(sdf.parse(strStart2)).before(sdf.parse(strEnd1))) {
            rentalTimes.add(new RentalTime(sdf.parse(strStart2), sdf.parse(strEnd2)));
            System.out.println(CarRental.canScheduleAll(rentalTimes));
        }
        if (!(sdf.parse(strStart3)).before(sdf.parse(strEnd2))) {
            rentalTimes.add(new RentalTime(sdf.parse(strStart3), sdf.parse(strEnd3)));
            System.out.println(CarRental.canScheduleAll(rentalTimes));
        }
    }

    static class RentalTime {
        public static Date start;
        public static Date end;

        public RentalTime(Date start, Date end) {
            this.start = start;
            this.end = end;

        }

        public static Date getStart() {
            return start;
        }

        public static Date getEnd() {
            return end;
        }
    }

    public static class CarRental {
        public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
    }
}
