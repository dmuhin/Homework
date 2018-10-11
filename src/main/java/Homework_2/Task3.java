package Homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    private final static Scanner scan = new Scanner(System.in);
    private static List<Long> FibonacciList = new ArrayList<Long>();
    private int counter = 2;
    private static int quantity;

    public static void main(String[] args) {
        quantity = getInfoFromScan();
        FibonacciList.add((long) 0);
        FibonacciList.add((long) 1);

        Task3 task3 = new Task3();
        task3.initFibonacciRow(quantity);
    }

    private static int getInfoFromScan(){
        System.out.println("Введите количество значений ряда Фибоначчи которое необходимо отобразить: ");
        return scan.nextInt();
    }

    private void getFibonacciRow(int quantity, int counter) {
        long longN_1 = FibonacciList.get((counter) - 1);
        long longN_2 = FibonacciList.get((counter) - 2);
        long longSumm= longN_1+longN_2;
        FibonacciList.add(longSumm);

        if (quantity == 0) {
            return;
        }
        getFibonacciRow(quantity - 1, ++counter);
    }

    private void initFibonacciRow(int quantity){
        getFibonacciRow(quantity-2, counter);
        printFibonacciRow();
    }

    private void printFibonacciRow() {
        System.out.println("Ряд Фибоначчи для "+ FibonacciList.size()+" цифр:");
        for (int i = 0; i< FibonacciList.size(); i++) {
            System.out.println("Цифра №"+i+" в ряду Фибоначчи: "+ FibonacciList.get(i));
        }
    }
}
