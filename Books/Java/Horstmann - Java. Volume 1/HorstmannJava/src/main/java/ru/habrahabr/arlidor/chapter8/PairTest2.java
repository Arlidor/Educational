package ru.habrahabr.arlidor.chapter8;

import java.time.LocalDate;

public class PairTest2 {

    public static void main(String args[]) {
        LocalDate[] birthday = {
            LocalDate.of(1906, 12, 9),
            LocalDate.of(1815, 12, 10),
            LocalDate.of(1903, 12, 3),
            LocalDate.of(1910, 6, 22)};
       // Pair<LocalDate> mm = ArrayAlg.minmax(birthday);
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());
    }

}
