package homework.lesson3;

import java.util.Random;


public class HomeWorkApp {
    public static void main(String[] args) {
        Random random = new Random();

        printThreeWords();
        printSeparator();
        checkSumSign();
        printSeparator();
        printColor();
        printSeparator();
        compareNumbers();
        printSeparator();
        System.out.println(checkSumInInterval(random.nextInt(15), random.nextInt(15)));
        printSeparator();
        checkNumberSign(random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE));
        printSeparator();
        System.out.println(checkNumberSignBoolean(random.nextInt
                (Integer.MIN_VALUE, Integer.MAX_VALUE)));
        printSeparator();
        printString("Hello", 3);
        printSeparator();
        System.out.println(isLeapYear(2024));
    }

    /*1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
    Orange, Banana, Apple.*/
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше
    или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;*/

    public static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt(-100, 100);
        int b = random.nextInt(-100, 100);
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная: " + a + " + " + b + " = " + (a + b));
        } else {
            System.out.println("Cумма отрицательная: " + a + " + " + b + " = " + (a + b));
        }
    }

    /*3.Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением
    . Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в
    пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) -
    “Зеленый”;*/

    public static void printColor() {
        Random random = new Random();
        int value = random.nextInt(-100, 100);
        if (value <= 0) {
            System.out.println(value + " - Красный");
        } else if (value <= 100) {
            System.out.println(value + " - Желтый");
        } else {
            System.out.println(value + " - Зеленый");
        }
    }

    /*4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >=
    b”, в противном случае “a < b”;*/

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(-100, 100);
        int b = random.nextInt(-100, 100);
        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    /*5. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean checkSumInInterval(int one, int two) {
        return (one + two) >= 10 && (one + two) <= 20;
    }

    /*6. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/

    public static void checkNumberSign(int number) {
        if (number < 0) {
            System.out.println(number + " - Отрицательное число");
        } else {
            System.out.println(number + " - Положительное число");
        }
    }

    /*7. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное.*/

    public static boolean checkNumberSignBoolean(int number) {
        return number < 0;
    }

    /*8. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз;*/

    public static void printString(String string, int count) {
        //Так как на этом уроке еще не проходили циклы, сделал через рекурсию.
        if (count > 0) {
            System.out.println(string);
            count--;
            printString(string, count);
        }
    }

    /*9."*"Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    високосный.*/

    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static void printSeparator() {
        System.out.println("*****");
    }
}
