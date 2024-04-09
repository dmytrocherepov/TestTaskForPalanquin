package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DateSorter dateSorter = new DateSorter();
        List<LocalDate> arr = new ArrayList<>();
        arr.add(LocalDate.of(2004, 7, 1));
        arr.add(LocalDate.of(2005, 1, 2));
        arr.add(LocalDate.of(2007, 1, 1));
        arr.add(LocalDate.of(2032, 5, 3));
        System.out.println(dateSorter.sortDates(arr));

    }
}