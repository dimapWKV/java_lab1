package edu.course.lab01;

public class QuadraticEquation {
    public void quadratic(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0) {
            final String ANSI_RED = "\u001B[31m";
            final String ANSI_RESET = "\u001B[0m";

            //Это я ошибку решил в красный покрасить :)
            System.out.println(ANSI_RED + "Ошибка: коэффициент a равен нулю, уравнение не является квадратным" + ANSI_RESET);

            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}