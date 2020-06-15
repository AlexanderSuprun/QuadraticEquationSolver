package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c, D, rootX1, rootX2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффициенты уравнения. \na = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();

        D = b * b - 4 * a * c;
        System.out.println(- b + Math.sqrt(D));
        // TODO add steps of solution
        if (D > 0) {
            rootX1 = (- b + Math.sqrt(D)) / (2 * a);
            rootX2 = (- b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root X1 = " + rootX1);
            System.out.println("Root X2 = " + rootX2);
        } else if (D == 0) {
            rootX1 = rootX2 = - b / 2 * a;
            System.out.println("Root X1 = Root X2 = " + rootX1);
        } else if (D < 0) {                                                 // complex roots
            double realNumber, imaginaryUnit;
            realNumber = - b / (2 * a);
            imaginaryUnit = Math.sqrt(Math.abs(D)) / (2 * a);
            System.out.println("Root X1 = " + realNumber + " + i" + imaginaryUnit);
            System.out.println("Root X2 = " + realNumber + " - i" + imaginaryUnit);
        }
    }
}
