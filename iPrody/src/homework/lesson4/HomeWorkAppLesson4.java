package homework.lesson4;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkAppLesson4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[random.nextInt(0, 11)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
        }
        System.out.println(Arrays.toString(array));
        changeArray(array);
        printSeparator();

        initArray();
        printSeparator();

        int[] arraytoMultiplyArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrayResultMultiplyArray = multiplyArray(arraytoMultiplyArray);
        System.out.println(Arrays.toString(arrayResultMultiplyArray));
        printSeparator();

        int arrayToDiagonalLenght = random.nextInt(0, 11);
        int[][] arrayToDiagonal = new int[arrayToDiagonalLenght][arrayToDiagonalLenght];
        for (int i = 0; i < arrayToDiagonal.length; i++) {
            for (int j = 0; j < arrayToDiagonal.length; j++) {
                arrayToDiagonal[i][j] = random.nextInt(0, 10);
            }
        }
        fillOneDiagonal(arrayToDiagonal);
        printSeparator();
        fillOneAndTwoDiagonal(arrayToDiagonal);
        printSeparator();

        System.out.println(Arrays.toString(fillArrayForValue(random.nextInt(1, 11),
                random.nextInt(0, 11))));
        printSeparator();

        int[] arrayToMinMax = new int[random.nextInt(1, 11)];
        for (int i = 0; i < arrayToMinMax.length; i++) {
            arrayToMinMax[i] = random.nextInt(0, 11);
        }
        System.out.println(Arrays.toString(arrayToMinMax));
        printMinMax(arrayToMinMax);
        printSeparator();

        System.out.println(findBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(findBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(findBalance(new int[]{10, 1, 2, 3, 4}));
        System.out.println(findBalance(new int[]{10, 1, 2, 3, 5}));
    }

    /*1. Метод принимает в качестве параметра целочисленный массив, состоящий из элементов 0 и 1. При помощи цикла и
    условия, данный метод заменяет 0 на 1, 1 на 0 соответственно. Затем, измененный массив необходимо написать в
    консоль.*/

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /*2. Метод инициализирует внутри себя пустой целочисленный массив длиной 100. При помощи цикла необходимо
    заполнить данный массив значениями от 1 до 100. Затем, заполненный значениями массив необходимо написать в
    консоль.*/

    public static void initArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    /*3. Метод принимает в качестве параметра заранее проинициализированный массив [1, 5, 3, 2, 11, 4, 5, 2,
    4, 8, 9, 1]. Необходимо в цикле обойти данный массив и каждый элемент значение которого меньше шести
    должен быть умножен на два. Затем, необходимо вернуть в качестве значения измененный экземпляр массива.*/

    public static int[] multiplyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    /*4. Метод принимает в качестве параметра заранее проинициализированный двумерный(квадратный) целочисленный массив
    с одинаковым количеством строк и столбцов. При помощи цикла, необходимо заполнить диагональные (главная диагональ)
    элементы массива единицами. Затем, измененный массив необходимо написать в консоль. Повторить задачу с заполнением
    главной и дополнительной диагоналей.*/

    public static void fillOneDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void fillOneAndTwoDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) || (j == (array.length - 1 - i))) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    /*5. Метод принимает в качестве параметра два аргумента: length и initialValue. Необходимо проинициализировать
    массив длины length, и заполнить его элементы значениями initialValue. Затем, необходимо вернуть в качестве
    значения измененный экземпляр массива.*/

    public static int[] fillArrayForValue(int length, int initialValue) {
        int[] array = new int[length];
        Arrays.fill(array, initialValue);
        return array;
    }

    /*6. **Метод принимает в качестве параметра одномерный целочисленный массив предварительно заполненный
    произвольными значениями. Необходимо найти минимальный и максимальный элементы в данном массиве, и напечатать его
    в консоль.*/

    public static void printMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.printf("Min: %d, Max: %d", min, max);
        System.out.println();
    }

    /*7. ** Метод принимает в качестве параметра одномерный целочисленный массив предварительно заполненный
    произвольными значениями. В данном массиве необходимо найти положение (индекс), в котором сумма левой и правой
    части значений массива равны. Затем, необходимо вернуть true в качестве значения если баланс найден, в противном
    случае - false.*/

    public static boolean findBalance(int[] array) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            rightSum += array[i];
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            if (leftSum == rightSum) {
                return true;
            } else {
                leftSum = 0;
            }
        }
        return false;
    }

    public static void printSeparator() {
        System.out.println("*****");
    }
}
