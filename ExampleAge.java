package br.com.rgaviolli.switchcase;

import java.util.Scanner;

public class ExampleAge {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Type your age: ");
        int age = s.nextInt();
        String ageSt = getAge(age);
        System.out.println(ageSt);

    }

    public static String getAge(int age) {
        String result;
        switch (age) {
            case 0:
            case 5:
                result = "You are a baby";
                break;
            case 6:
            case 10:
                result = "You are a kid";
                break;
            case 11:
            case 18:
                result = "You are a teenager";
                break;
            case 19:
            case 55:
                result = "You are a adult";
                break;
            default:
                result = "You are a elderly";
                break;
        }
        return result;
    }
}
