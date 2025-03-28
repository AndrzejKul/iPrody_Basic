package homework.lesson6;

import java.util.Arrays;

public class HomeWorkAppLesson6 {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4};
        int[] targetArray = {5, 6, 7};
        System.out.println(Arrays.toString(arrayCopy(sourceArray, targetArray)));

        int[] targetArrayEmpty = {};
        System.out.println(Arrays.toString(arrayCopy(sourceArray, targetArrayEmpty)));
        System.out.println("*".repeat(20));

        int[] shakeArray = {4, 2, 3, 0, 5, 1, 8, 1};
        int[] shakeArrayTest = {8, 1, 1, 3, 1};
        int[] shakeArrayTest2 = {1, 2, 3, 9, 0, 0, 9};

        System.out.println(Arrays.toString(shakeSort(shakeArray)));
        System.out.println(Arrays.toString(shakeSort(shakeArrayTest)));
        System.out.println(Arrays.toString(shakeSort(shakeArrayTest2)));
    }

    /*Необходимо реализовать метод “arrayCopy”. Метод “arrayCopy” должен копировать значения исходного массива
    (source) в массив назначения (target). При реализации данного метода следует учесть, что копирование в target
    может производиться с последнего индекса хранящего непустое знание, поскольку данный массив уже может быть
    заполнен значениями.*/

    public static int[] arrayCopy(int[] source, int[] target) {
        int length = source.length + target.length;
        int[] result = new int[length];
        if (target.length > 0) {
            int counter = 0;
            for (int i = 0; i < target.length; i++) {
                result[i] = target[i];
                counter++;
            }
            for (int i = 0; i < source.length; i++) {
                result[counter] = source[i];
                counter++;
            }
            return result;
        } else {
            for (int i = 0; i < result.length; i++) {
                result[i] = source[i];
            }
            return result;
        }
    }

    /*Необходимо реализовать "Шейкерную сортировку".*/
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] shakeSort(int[] array) {
        int begin = 0;
        int end = array.length - 1;
        for (int i = begin; i < array.length - 1 - i; i++) {
            if (begin == end) {
                break;
            }
            if (begin % 2 == 0) {
                for (int j = begin; j < end; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                begin++;
            } else {
                for (int j = end; j >= begin; j--) {
                    if (array[j] < array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
                end--;
            }
        }
        return array;
    }
}