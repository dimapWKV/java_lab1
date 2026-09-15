package edu.course.lab01;

public class SeriesCalculator {
    public void series() {
        double sum = 0.0;
        int n = 2;
        int lastN = -1;
        int count = 0;

        while (true) {
            double term = 1.0 / (n * n + n - 2);
            if (Math.abs(term) < 1e-6) {
                break;
            }
            sum += term;
            lastN = n;
            count++;
            n++;
        }

        System.out.println("Сумма = " + sum);
        System.out.println("Последний добавленный n = " + lastN);
        System.out.println("Количество членов = " + count);
    }
}