package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 4;
        switch (num){
            case 1:
                System.out.println("Число равно одному");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трем");
                break;
            case 4:
                System.out.println("Число равно четырем");
                break;
            default:
                System.out.println("Число не распознано!");
        }

        int age = 16;
        int temperature = 20;
        boolean isRainy = false;

        if ((isRainy || temperature < 10) && (age < 18)){
            System.out.println("Не выходи на улицу");
        } else if ((!isRainy || temperature > 10) && (age < 18)){
            System.out.println("Можешь выйти на улицу!");
        }

        System.out.println(minFunction(2,4));
        methodRankPoints(255.7);
    }

    public static int minFunction(int value_1, int value_2){
        int min;
        if (value_1 > value_2) min = value_2;
        else min = value_1;
       return min;
    }

    public static void methodRankPoints(double points){
        if (points >= 202.5){
            System.out.println("Ранг A1");
        } else if (points >= 122.4){
            System.out.println("Ранг A2");
        } else {
            System.out.println("Ранг A3");
        }
    }
}
