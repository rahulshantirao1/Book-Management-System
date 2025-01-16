package com.testing.configuration;

import java.util.Arrays;
import java.util.List;

public class A {

    public static void main(String[] args) {
        /*Given a list of strings, write a program to find and print
         the strings containing duplicate characters using Java Stream API.*/

        List<String> list = Arrays.asList("Aaa", "ram  ", "Shyam", "gitaa");
        list.stream().filter(e->e.trim().length()>(e.trim()).chars().distinct().count()).forEach(System.out::println);

        /* Write a program to check if all
         elements in a list of strings are of the same length using Java Stream API.*/
        List<String> name = Arrays.asList("Rahul", "Rohit", "Ranjt", "Visha");
        boolean b = name.stream().allMatch((e) -> e.length() ==name.get(1).length());
        System.out.println(b);
    }
}
