package com.company;


import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        String name;
        String code;
        String sen;
        String reshte;
        String gerayesh;

        Scanner scanner = new Scanner(System.in);

        System.out.println("name:");
        name = scanner.nextLine();
        System.out.println("code:");
        code = scanner.nextLine();
        System.out.println("sen:");
        sen = scanner.nextLine();
        System.out.println("reshte:");
        reshte = scanner.nextLine();
        System.out.println("geraayesh:");
        gerayesh=scanner.nextLine();

        Map list = new HashMap();

        list.put("name:" , name);
        list.put("code:" , code);
        list.put("sen:" , sen);
        list.put("reshte:" , reshte);
        list.put("gerayesh:" , gerayesh);
        Set set = list.keySet();
        for(Object a : set ){
            System.out.println(a + ":" + list.get(a));
        }
    }
}
