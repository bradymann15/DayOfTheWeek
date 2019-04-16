package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        poem();
        System.out.println(" ");
        System.out.println("So, which day of the week to you come from?");
        birthdateweekday(keyboard);



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

    public static void birthdateweekday(Scanner keyboard){
        System.out.println("What is your birth month?");
        String birth = keyboard.nextLine();
        System.out.println("Now, enter your birth month as a number");
        int month = keyboard.nextInt();
        if (month == 1){
            month = 13;
        }
        else if (month == 2){
            month = 14;}
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(birth+" has 30 days in it");
                break;
            case 14:
                System.out.println(birth+" has 28 days in it, and 29 days on a leap year");
                break;
                default:
                    System.out.println(birth+" has 31 days in it");
                    break;

        }
        System.out.println("What is the date of your birth?");
        int date = keyboard.nextInt();
        System.out.println("What year were you born on?");
        int year = keyboard.nextInt();
        int century = year/100;
        int yearOfCentury = year%100;
        String dayOfTheWeek;
        int dayoftheweek =((date+((13*(month+1))/5)+yearOfCentury+(yearOfCentury/4)+(century/4)+(5*century))%7);
        switch(dayoftheweek){
            case 0:
                dayOfTheWeek = "Saturday";
                break;
            case 1:
                dayOfTheWeek = "Sunday";
                break;
            case 2:
                dayOfTheWeek = "Monday";
                break;
            case 3:
                dayOfTheWeek = "Tuesday";
                break;
            case 4:
                dayOfTheWeek = "Wednesday";
                break;
            case 5:
                dayOfTheWeek = "Thursday";
                break;
            default:
                dayOfTheWeek = "Friday";
                break;
        }
        System.out.println("You were born on a "+dayOfTheWeek);
        switch(dayOfTheWeek){
            case "Monday":
                System.out.println("You are fair of face");
                break;
            case "Tuesday":
                System.out.println("You are full of grace");
                break;
            case "Wednesday":
                System.out.println("You are full of woe");
                break;
            case "Thursday":
                System.out.println("You have far to go");
                break;
            case "Friday":
                System.out.println("You are loving and giving");
                break;
            case "Saturday":
                System.out.println("You work hard for a living");
            case "Sunday":
                System.out.println("You are fair and wise and good in everyway");
                break;
        }


        System.out.println(dayoftheweek);

        }






    }







