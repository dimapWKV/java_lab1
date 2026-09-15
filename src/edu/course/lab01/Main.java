package edu.course.lab01;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Вы запустили файл без команды");
            System.out.println("Команды: fizzbuzz | reverse <строка> | quadratic <a> <b> <c> | series | palindrome <строка>");
            return;
        }

        String command = args[0];

        switch (command) {
            case "fizzbuzz" -> {
                FizzBuzz fz = new FizzBuzz();
                fz.fizzbuzz();
            }

            case "reverse" -> {
                if (args.length < 2) {
                    System.out.println("Нужна строка: reverse <строка>");
                    return;
                }
                TextTasks TT = new TextTasks();
                String result = TT.reverse(args[1]);
                System.out.println(result);
            }

            case "palindrome" -> {
                if (args.length < 2) {
                    System.out.println("Нужна строка: palindrome <строка>");
                    return;
                }
                TextTasks TT = new TextTasks();
                Boolean a = TT.palindrom(args[1]);
                System.out.println(a);
            }

            case "quadratic" -> {
                if (args.length < 4) {
                    System.out.println("Нужны 3 коэффициента: quadratic <a> <b> <c>");
                    return;
                }
                QuadraticEquation Qd = new QuadraticEquation();
                Qd.quadratic(new String[]{args[1], args[2], args[3]});
            }

            case "series" -> {
                SeriesCalculator SC = new SeriesCalculator();
                SC.series();
            }

            default -> System.out.println("Неизвестная команда: " + command);
        }
    }
}