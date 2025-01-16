package com.testing.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {
        /*Given a list of strings, write a program to find and print
         the strings containing duplicate characters using Java Stream API.*/

        List<String> list = Arrays.asList("Aaa", "ram  ", "Shyam", "gitaa");
        list.stream().filter(e->e.trim().length()>(e.trim()).chars().distinct().count()).forEach(System.out::println);

        /* Write a program to check if all
         elements in a list of strings are of the same length using Java Stream API.*/
        List<String> name = Arrays.asList("Rahul", "Rohit", "Ranjit", "Vishal Hello");
        boolean b = name.stream().allMatch((e) -> e.length() ==name.get(1).length());
        List<Integer> collect = name.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(b);
        List<String> name2 = Arrays.asList("uuuu", "tttt");
        boolean b1 = name2.stream().map(String::length).distinct().count() == 1;
        System.out.println("This is "+b1);

        /*Given a list of integers, write a program to find and print the
        difference between the maximum and minimum numbers using Java Stream API.*/
        List<Integer> no
                = Arrays.asList(3, 5, 8, 2, 9, 4);
        int max = no.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        int min = no.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
        System.out.println("This is the difference between "+(max-min));

    }
}
