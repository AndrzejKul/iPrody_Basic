package homework.lesson12;

import java.util.Arrays;
import java.util.Random;

public class ArrayValueCalculator {
    private static final Random random = new Random();
    private static final String[][] arrayTrueSize = new String[4][4];
    private static final String[][] arrayFalseSize = new String[4][5];
    private static String[][] arrayFalseData;

    public static void main(String[] args) {
        fillArray(arrayTrueSize);
        fillArray(arrayFalseSize);
        arrayFalseData = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "TROUBLE", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};
        try {
            System.out.println(Arrays.deepToString(arrayTrueSize));
            System.out.println(doCalc(arrayTrueSize));
            //System.out.println(Arrays.deepToString(arrayFalseSize));
            //System.out.println(doCalc(arrayFalseSize));
            //Здесь мы комментируем один из двух массивов, дающих исключения, для проверки работоспособности кода,
            //что-бы не дублировать try-catch.
            System.out.println(Arrays.deepToString(arrayFalseData));
            System.out.println(doCalc(arrayFalseData));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int doCalc(String[][] array) {
        if (array.length != 4) {
            throw new ArraySizeException("Array outside size error");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new ArraySizeException("Array inside size error");
            }
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!checkStringToInt(array[i][j])) {
                    throw new ArrayDataException("Check position [" + i + "][" + j + "] failed");
                }
                result += Integer.parseInt(array[i][j]);
            }
        }
        return result;
    }

    public static boolean checkStringToInt(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.print("Illegal symbol. ");
            return false;
        }
    }

    public static void fillArray(String[][] array) {
        for (String[] strings : array) {
            Arrays.fill(strings, String.valueOf(random.nextInt(0, 11)));
        }
    }
}
