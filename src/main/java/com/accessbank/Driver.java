package com.accessbank;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Driver {

    public static void main(String[] args) {


        /*List<String >ss = Arrays.asList("salam","xxxsalam","goods","do you have how many year experience with  java ? ");
        String s = "sala";
        find2(s,ss).ifPresent(System.out::println);

        Optional<Integer> reduce = ss.stream().map(String::length)
                .reduce((a, b) -> a + b);*/

       /* Person p= Person.builder().FindCode("salam")
                .age(23).name("ilkin").build();
        System.out.println(p.toString());*/

        System.out.println("salam testing ");
        System.out.println("salam testing 2  ");
        System.out.println("salam testing  3 ");
        System.out.println("ammend command push for test");


    }

    public static <T> Optional<T> find(T t, List<T> list) {
        return list.stream().filter(s -> s.equals(t)).findAny();
    }

    public static <T> OptionalInt find2(T t, List<T> list) {
         return IntStream.range(0, list.size())
                .filter(i -> t.equals(list.get(i)))
                .findFirst();
    }

    public static Optional<String > findMultiThreading(String  t, List<String> list) {
        return list.parallelStream().filter(s -> s.contains(t)).findAny();
    }

}


