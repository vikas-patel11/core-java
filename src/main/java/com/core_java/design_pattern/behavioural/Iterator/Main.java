package com.core_java.design_pattern.behavioural.Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
