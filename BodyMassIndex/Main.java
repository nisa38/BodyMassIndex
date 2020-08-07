package BodyMassIndex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("your weight : ");
        int weight = sc.nextInt();

        System.out.println("your length (for eg : 1,72): ");
        double length = sc.nextDouble();

        double bki = (weight / length * length);

        if (bki < 18.5)
            System.out.println("Underweight");

        else if (bki >= 18.5 && bki < 25)
            System.out.println("Normal weight ");

        else if (bki >= 25 && bki < 30)
            System.out.println("Overweight  ");

        else{
            System.out.println("Obesity ");
        }
    }
}
