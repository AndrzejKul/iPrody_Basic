package homework.lesson8;

public class HomeWorkAppLesson8 {
    public static void main(String[] args) {
        String forTest = "Hello World!";
        System.out.println(findSymbolOccurance(forTest, 'l'));
        System.out.println("*".repeat(20));

        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apple", "plant"));
        System.out.println(findWordPosition("Hello World", "orl"));
        System.out.println("*".repeat(20));

        System.out.println(stringReverse("Hello"));
        System.out.println("*".repeat(20));

        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));
    }

    /*Реализовать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ. Необходимо
    вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение.*/
    public static int findSymbolOccurance(String string, char symbol) {
        char[] chars = string.toCharArray();
        int result = 0;
        for (char aChar : chars) {
            if (aChar == symbol) {
                result++;
            }
        }
        return result;
    }

    /* Реализовать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
    Необходимо выяснить, является ли target (подстрока) частью строки source. Если да, тогда вернуть номер позиции
    (индекс) первого элемента подстроки в строке, иначе вернуть -1.
    Пример 1: Source: Apollo Target: pollo Result: 1
    Пример 2: Source: Apple Target: Plant Result: -1*/

    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        }
        return -1;
    }

    /* Реализовать метод stringReverse. Метод принимает в качестве параметра строку. Необходимо развернуть данную
    строку и вернуть измененный вариант.
    Пример 1: Hello -> olleH*/

    public static String stringReverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    /* Реализовать метод isPalindrome. Метод принимает в качестве параметра строку. Необходимо Проверить является
    ли переданная строка палиндромом. Если да, тогда вернут true, иначе false.
    Пример 1: ERE -> true
    Пример 2: Allo -> false*/

    public static boolean isPalindrome(String string) {
        String reversed = stringReverse(string);
        return reversed.equals(string);
    }
}
