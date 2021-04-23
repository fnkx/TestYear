package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> mappp = new HashMap<>();
        namesBdaysVoid("Вася", "1989", mappp);
        System.out.println(mappp.entrySet());


        HashMap<String, Integer> item1 = namesBdays("Петр1", "1996");
        HashMap<String, Integer> item2 = namesBdays("Петр2", "1993");
        HashMap<String, Integer> item3 = namesBdays("Петр3", "1990");
        HashMap<String, Integer> item4 = namesBdays("Петр4", "sdaf");
        HashMap<String, Integer> item5 = namesBdays("Петр5", "1991");

        Map<String, Integer> hashMap = new HashMap<>();
        item1.forEach(hashMap::put);
        item2.forEach(hashMap::put);
        item3.forEach(hashMap::put);
        item5.forEach(hashMap::put);

        System.out.println(hashMap);
        System.out.println();
        hashMap.entrySet().forEach(System.out::println);

        hashMap.forEach((k, v) -> System.out.println("Имя:" + k + " " + "Год:" + v));

        String min;
        min = hashMap
                .entrySet()
                .stream()
                .filter(v -> v.getValue() != null)
                .min(Map.Entry.comparingByValue())
                .get()
                .getKey();


        System.out.println("Самый старший:" + (min) + " " + "Год рождения:" + hashMap.get(min));


    }

    public static HashMap<String, Integer> namesBdays(String name, String bday) {

        Integer intBday;

        try {
            intBday = Integer.parseInt(bday);
        } catch (NumberFormatException e) {
            intBday = null;
        }
        HashMap<String, Integer> namesBdays = new HashMap<String, Integer>();
        namesBdays.put(name, intBday);
        return namesBdays;

    }

    public static void namesBdaysVoid(String name, String bday, HashMap<String, Integer> mapp) {

        Integer intBday;

        try {
            intBday = Integer.parseInt(bday);
        } catch (NumberFormatException e) {
            intBday = null;
        }

        mapp.put(name, intBday);

    }


}
