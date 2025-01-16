package com.testing.configuration;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        /*Write a program to remove all whitespace from a list of strings using Java Stream API.*/
        List<String> stringList = Arrays.asList("Rahul ", "name ", "email  ", "  mobile");
        List<String> collect1 = stringList.stream().map(e -> Arrays.stream(e.trim().split(" ")).map(ea -> new StringBuilder(ea)).collect(Collectors.joining()))
                .collect(Collectors.toList());
        for (String s:collect1)
        {
            System.out.println(s.length());
        }
        System.out.println(collect1);

        /* Given a list of strings, write a program to find and
        print the strings containing a specific substring using Java Stream API.*/
        String sub="Ra";

        List<String> containsSubstring = stringList.stream().filter(e -> e.contains(sub)).collect(Collectors.toList());
        System.out.println(containsSubstring);

        /*Write a program to find the mode of a list of integers using Java Stream API.*/
        List<Integer> list1 = Arrays.asList(3, 4, 5, 2, 4, 4,5, 8, 9,9, 9);

        LinkedHashMap<Integer, Long> list2 = list1.stream().map(e -> e).collect(Collectors.groupingBy(ea -> ea, LinkedHashMap::new, Collectors.counting()));
        long frequency = list2.values().stream().mapToLong(Long::longValue).max().orElse(0);
        List<Boolean> collect2 = list2.entrySet().stream().map(e -> e.getValue() == frequency).map(ea->ea).collect(Collectors.toList());
        System.out.println(collect2+" Hello");


        Map.Entry<Integer, Long> integerLongEntry = list1.stream().map(e -> e).collect(Collectors.groupingBy(ea -> ea, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().max((t, s) -> t.getValue().intValue() - s.getValue().intValue()).orElse(null);
        System.out.println("this is the value:"+ integerLongEntry);

    }
}
