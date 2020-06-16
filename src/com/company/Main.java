package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        input();
    }

    private static void input() {
        double a = 0, b = 0, c = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите коэффициенты уравнения. \na = ");
            a = scanner.nextDouble();

            while (a == 0) {
                System.out.print("Коэффициент 'a' не может быть равен 0! \na = ");
                a = scanner.nextDouble();
            }

            System.out.print("b = ");
            b = scanner.nextDouble();
            System.out.print("c = ");
            c = scanner.nextDouble();

            calculateRoots(a, b, c);
        } catch (InputMismatchException exception) {
            System.out.println("Некорректный ввод значений коэффициентов");
            input();
        }
    }

    private static void calculateRoots(double a, double b, double c) {
        double D, rootX1, rootX2;
        D = b * b - 4 * a * c;
        // TODO add steps of solution
        if (D > 0) {
            rootX1 = (-b + Math.sqrt(D)) / (2 * a);
            rootX2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root X1 = " + rootX1);
            System.out.println("Root X2 = " + rootX2);
        } else if (D == 0) {
            rootX1 = rootX2 = -b / 2 * a;
            System.out.println("Root X1 = Root X2 = " + rootX1);
        } else if (D < 0) {                                                 // complex roots
            double realNumber, imaginaryUnit;
            realNumber = -b / (2 * a);
            imaginaryUnit = Math.sqrt(Math.abs(D)) / (2 * a);
            System.out.println("Root X1 = " + realNumber + " + i" + imaginaryUnit);
            System.out.println("Root X2 = " + realNumber + " - i" + imaginaryUnit);
        }
    }
}
