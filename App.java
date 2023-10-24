package com.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // p1
        int[] x = {1,2,3,4,5};
        int[] y = {5,4,3,2,1};
        int[] z = {Math.max(x[0],y[0]), Math.max(x[1],y[1]), Math.max(x[2],y[2]), Math.max(x[3],y[3]), Math.max(x[4],y[4])};
        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));
        // p2
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alan");
        names.add("Bruce");
        names.add("Chris");
        names.add("Dan");
        names.add("Eden");
        String[] old_names = new String[names.size()];
        String[] new_names = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            old_names[i] = name;
            char f = name.charAt(0);
            char l = name.charAt(name.length()-1);
            String middle = name.substring(1, name.length() - 1);
            String new_name = Character.toUpperCase(l) + middle + Character.toLowerCase(f);
            new_names[i] = new_name;
        }
        System.out.println("Names = " + Arrays.toString(old_names));
        System.out.println("Names(Switched) = " + Arrays.toString(new_names));
    }
}