package br.com.rgaviolli.switchcase;

import java.util.Scanner;

public class ExampleAnimal {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Type a name of animal: ");
        String text = s.next();
        String animal = exampleOfSwitch(text);
        System.out.println(animal);
    }

    public static String exampleOfSwitch(String animal) {
        String result;
        switch (animal) {
            case "DOG":
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild animal";
                break;
            default:
                result = "Unknown animal";
                break;
        }
        return result;
    }
}
