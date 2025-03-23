package homework.lesson5;

import java.util.Arrays;

public class HomeWorkAppLesson5 {
    /*Важно, подразумевается что у экземпляра “Списка” всегда будет статическая длина, о которой разработчик
    уведомлен, что исключает ошибки в случае выхода за пределы длины списка.*/
    private static int SIZE = 5;
    private static int TAIL = SIZE - 1;

    public static void main(String[] args) {
        int[] array = initArray(SIZE);
        System.out.println(Arrays.toString(array));

        array = addToEndArray(array, 15);
        System.out.println(Arrays.toString(array));
        array = addToEndArray(array, 16);
        array = addToEndArray(array, 17);
        array = addToEndArray(array, 18);
        array = addToEndArray(array, 19);
        System.out.println(Arrays.toString(array));
        array = addToEndArray(array, 20);
        System.out.println(Arrays.toString(array));

        System.out.println(getValue(array, 7));

        System.out.println(lengthArray(array));
        System.out.println("*".repeat(10));

        int[] queue = initQueue(SIZE);
        System.out.println(Arrays.toString(queue));
        queue = addToStartQueue(queue, 9);
        System.out.println(Arrays.toString(queue));
        queue = addToEndQueue(queue, 10);
        System.out.println(Arrays.toString(queue));
        System.out.println(getValueQueue(queue));
        System.out.println("*".repeat(10));

        int[] deque = initDeque(SIZE);
        System.out.println(Arrays.toString(deque));
        deque = addToStartDeque(deque, 111);
        System.out.println(Arrays.toString(deque));
        deque = addToEndDeque(deque, 112);
        System.out.println(Arrays.toString(deque));
        System.out.println(getHeadValueDeque(deque));
        System.out.println(getTailValueDeque(deque));
    }

    //ЗАДАЧА 1
    /*Инициализация списка. В качестве параметров метод принимает размер списка и инициализирует его. Возвращающемся
    значением должен быть одномерный целочисленный массив указанной длины.*/
    public static int[] initArray(int size) {
        /*Из условия не совсем понятно, нужно ли просто проинициализировать значением по умолчанию (0) или заполнить
        случайными значениями. Оставил вариант с инициализацией значениями по умолчанию*/
        return new int[size];
    }

    /*Добавление в список. В качестве параметров метод принимает проинициализированный одномерный целочисленный
    массив и новое значение. Данное значение должен быть добавлено в конец списка.*/
    public static int[] addToEndArray(int[] array, int newValue) {
        if (array.length == TAIL + 1) {
            int[] newArray = new int[SIZE * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[TAIL + 1] = newValue;
            SIZE = newArray.length;
            TAIL++;
            return newArray;
        } else {
            array[TAIL + 1] = newValue;
            TAIL++;
            return array;
        }
    }

    /*Получение значения по индексу. В качестве параметра метод принимает проинициализированный одномерный
    целочисленный массив. Значение соответствующее указанному индексу должно быть получено из списка и возвращено в
    качестве возвращаемого значения метода.*/

    public static int getValue(int[] array, int index) {
        return array[index];
    }

    /*Получение длины списка. В качестве параметра метод принимает проинициализированный одномерный целочисленный
    массив. Значение соответствующее длине списка должно быть возвращено в качестве возвращаемого значения метода.*/

    public static int lengthArray(int[] array) {
        return array.length;
    }

    //ЗАДАЧА 2
    /*Инициализация очереди. В качестве параметров метод принимает размер очереди и инициализирует ее. Возвращающемся
     значением должен быть одномерный целочисленный массив указанной длины.*/

    public static int[] initQueue(int size) {
        return new int[size];
    }

    /*Добавление в очередь. В качестве параметров метод принимает проинициализированный одномерный целочисленный
    массив и новое значение. Данное значение должен быть добавлено очередь.*/

    //Знаю, что по умолчанию в очереди элементы добавляются в конец, но решил реализовать оба варианта
    public static int[] addToStartQueue(int[] queue, int newValue) {
        int[] newQueue = new int[queue.length + 1];
        System.arraycopy(queue, 0, newQueue, 1, queue.length);
        newQueue[0] = newValue;
        return newQueue;
    }

    public static int[] addToEndQueue(int[] queue, int newValue) {
        int[] newQueue = new int[queue.length + 1];
        System.arraycopy(queue, 0, newQueue, 0, queue.length);
        newQueue[newQueue.length - 1] = newValue;
        return newQueue;
    }

    /*Получение из очереди. В качестве параметра метод принимает проинициализированный одномерный целочисленный
    массив. Ближайшее значение (согласно принципу FIFO) должно быть извлечено из очереди и возвращено в качестве
    возвращаемого значения метода.*/

    public static int getValueQueue(int[] queue) {
        return queue[0];
    }

    //ЗАДАЧА 3
    /*Инициализация очереди. В качестве параметров метод принимает размер очереди и инициализирует ее. Возвращающемся
     значением должен быть одномерный целочисленный массив указанной длины.*/

    public static int[] initDeque(int size) {
        return new int[size];
    }

    /*Добавление в голову очереди. В качестве параметров метод принимает проинициализированный одномерный
    целочисленный массив и новое значение. Данное значение должен быть добавлено в голову очереди.*/

    public static int[] addToStartDeque(int[] deque, int newValue) {
        int[] newDeque = new int[deque.length + 1];
        System.arraycopy(deque, 0, newDeque, 1, deque.length);
        newDeque[0] = newValue;
        return newDeque;
    }

    /*Получение из головы очереди. В качестве параметра метод принимает проинициализированный одномерный
    целочисленный массив. Ближайшее значение должно быть извлечено из головы очереди и возвращено в качестве
    возвращаемого значения метода.*/
    public static int getHeadValueDeque(int[] deque) {
        return deque[0];
    }

    /*Добавление в хвост очереди. В качестве параметров метод принимает проинициализированный одномерный
    целочисленный массив и новое значение. Данное значение должен быть добавлено в хвост очереди.*/
    public static int[] addToEndDeque(int[] deque, int newValue) {
        int[] newDeque = new int[deque.length + 1];
        System.arraycopy(deque, 0, newDeque, 0, deque.length);
        newDeque[newDeque.length - 1] = newValue;
        return newDeque;
    }

    /*Получение из хвоста очереди. В качестве параметра метод принимает проинициализированный одномерный
    целочисленный массив. Ближайшее значение должно быть извлечено из хвоста очереди и возвращено в качестве
    возвращаемого значения метода.*/

    public static int getTailValueDeque(int[] deque) {
        return deque[deque.length - 1];
    }
}