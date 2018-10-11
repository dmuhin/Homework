package Homework_2;

import java.util.Scanner;

public class Task1 {

    static Scanner scan = new Scanner(System.in);
    static String stars;
    static int lenght;
    static String userFullName = "";
    static String course = "";
    static String student = "";

    public static void main(String[] args) {
        userFullName = getUserFullName();
        lenght = getScanStrLenght();
        stars = printStars(lenght);
        course = getCourse(lenght);
        student = getStudent(lenght);
        System.out.println(stars);
        System.out.println(course);
        System.out.println(student);
        System.out.println(userFullName);
        System.out.println(stars);
    }

    private static String getUserFullName() {
        System.out.print("Введите ФИО: ");
        String str = "";
        str = scan.nextLine();
        str = "*  " + str + "  *";
        return str;
    }

    private static String getCourse(int maxLength) {
        String course = "Курс: Java";
        int spacesForCourse = (maxLength - course.length()-2)/2;
        int remainder = maxLength%2;
        for (int i = 0; i < spacesForCourse; i++) {
            course = " " + course;
            course = course + " ";
        }
        if (remainder != 0) {
            course = "*" + course + " *";
        } else {
            course = "*" + course + "*";
        }
        return course;
    }

    private static String getStudent(int maxLength) {
        String course = "Студент";
        double numOfSpaces = (maxLength - course.length()) / 2;
        int spacesForCourse = (int) Math.ceil(numOfSpaces);
        int remainder = maxLength%2;
        for (int i = 0; i < spacesForCourse; i++) {
            course = " " + course;
            course = course + " ";
        }
        if (remainder == 0) {
            course = "*" + course + "*";
        } else {
            course=course.substring(1,course.length()-1);
            course = "*" + course + "*";
        }
        return course;
    }

    private static int getScanStrLenght() {
        return userFullName.length();
    }

    private static String printStars(int numberOfStars) {
        String str = "";
        for (int i = 0; i < numberOfStars; i++) {
            str = str + "*";
        }
        return str;
    }
}
