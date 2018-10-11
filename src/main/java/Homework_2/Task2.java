package Homework_2;

import Homework_2.core.Choice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    private static Scanner scan = new Scanner(System.in);
    private static long number;
    private static long maxNumber;
    private static long minNumber;

    public static void main(String[] args) {
        initializeAllValues();
        prlonger(number, maxNumber, minNumber);
    }

    private static List<Long> getAlllongs(long longForParse) {
        List<Long> longList = new ArrayList<Long>();
        for (int i = 0; i < String.valueOf(longForParse).length(); i++) {
            longList.add(Long.valueOf(String.valueOf(longForParse).substring(i, i + 1)));
        }

        return longList;
    }

    private static long getLongFromScan() {
        System.out.println("Укажите число для выбора найбольшего и найменьшого числа: ");
        long i;
        i = scan.nextLong();
        return i;
    }

    private static long getMaxMinNumber(List<Long> longListForParse, Choice MaxOrMin) {
        if (MaxOrMin == Choice.MAX) {
            return Collections.max(longListForParse);
        } else {
            return Collections.min(longListForParse);
        }
    }

    private static void prlonger(long number, long maxNumber, long minNumber) {
        System.out.println("У числа: " + number);
        System.out.println("Максимальное значение: " + maxNumber);
        System.out.println("Минимальное значение: " + minNumber);
    }

    private static void initializeAllValues() {
        number = getLongFromScan();
        List<Long> longList = getAlllongs(number);
        maxNumber = getMaxMinNumber(longList, Choice.MAX);
        minNumber = getMaxMinNumber(longList, Choice.MIN);
    }
}
