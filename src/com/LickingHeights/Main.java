package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        poem();
        System.out.println(" ");
        System.out.println("So, which day of the week to you come from?");
        birthmonth(keyboard);

    }
    public static void poem(){
        System.out.println("There is a nursery rhyme that goes like this....");
        System.out.println(" ");
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
        }

    public static int birthmonth(Scanner keyboard){
        System.out.println("What is your birth month?");
        String birth = keyboard.nextLine();
        System.out.println("Now, enter your birth month as a number");
        int month = keyboard.nextInt();
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(birth+" has 30 days in it");
                break;
            case 2:
                System.out.println(birth+" has 28 days in it, and 29 days on a leap year");
                break;
                default:
                    System.out.println(birth+" has 31 days in it");

        }
        return month;
    }






}
