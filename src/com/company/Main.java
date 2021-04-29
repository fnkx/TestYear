package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> mappp = new HashMap<>();
        //namesBdaysVoid("Вася", "1989", mappp);
        System.out.println(mappp.entrySet());


        namesBdaysVoid("Петр1", "1996", mappp);
        namesBdaysVoid("Петр2", "1993", mappp);
        namesBdaysVoid("Петр3", "1990", mappp);
        namesBdaysVoid("Петр4", "sdaf", mappp);
        namesBdaysVoid("Петр5", "1991", mappp);


        System.out.println(mappp);
        System.out.println();
        mappp.entrySet().forEach(System.out::println);  //set

        mappp.forEach((k, v) -> System.out.println("Имя:" + k + " " + "Год:" + v));

        String min;
        min = mappp
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() != null)
                .min(Map.Entry.comparingByValue())
                .get() //Optional
                .getKey();


        System.out.println("Самый старший:" + (min) + " " + "Год рождения:" + mappp.get(min));


    }

    public static void namesBdaysVoid(String name, String bday, HashMap<String, Integer> mapp) {


        Integer intBday = null;

        try {
            intBday = Integer.parseInt(bday); //checked unchecked exception java
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException " + e); //нужен лог
        }

        mapp.put(name, intBday);

    }


}

/* новая ветка
коммит
+ месаге
пуш
.iml .idea все это в коммите добавить в игнор + удалить в репе все это
коммит
 */