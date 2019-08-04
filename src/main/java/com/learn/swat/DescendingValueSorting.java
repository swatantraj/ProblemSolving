package com.learn.swat;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class DescendingValueSorting {
    public static void main(String args[]) {
        List<String> input = Arrays.asList("abc","pqr","xyz","abc","xyz","abc","def","abc","mno","xyz","mno","xyz","xyz");
        List<Map.Entry<String, Integer>> list =
                new LinkedList<>(input.stream().collect(groupingBy(Function.identity(), summingInt(e -> 1))).entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        System.out.println(list);
    }
}
