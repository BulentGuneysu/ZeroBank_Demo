package com.zerobank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<String> stringofDates=new ArrayList<>();
        stringofDates.add("2012-09-06");
        stringofDates.add("2012-09-05");
        stringofDates.add("2012-09-01");
        List<Date> dates= new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (String stringofDate:stringofDates) {
            Date date = simpleDateFormat.parse(stringofDate);
            dates.add(date);

        }
        System.out.println("dates.get(0).after(dates.get(1)) = " + dates.get(0).after(dates.get(1)));
        System.out.println( dates.get(1).before(dates.get(2)));
    }
    public static boolean isDateOrdered(List<String> stringofDates) throws ParseException {
        List<Date> dates= new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (String stringofDate:stringofDates) {
            Date date = simpleDateFormat.parse(stringofDate);
            dates.add(date);

        }

        System.out.println("dates = " + dates);
        for (int i = 0; i < dates.size(); i++) {
            for (int j = i+1; j < dates.size(); j++) {
                if (dates.get(i).compareTo(dates.get(j))<=0){
                    return false;
                }
            }
        }
        return true;
    }
}
