package homework.lesson8;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {

    /* Реализовать программу по отгадыванию слов
    a. Реализовать класс обладающий полем типа данных массив строк и проинициализированный следующими значениями:
    *"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
    "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
    "pumpkin", "potato" *
    b. Реализовать метод запуска программы. При запуске программы компьютер загадывает слово, запрашивает ответ у
    пользователя, сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    c. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах. Например, apple – загаданное,
    а apricot - ответ игрока, тогда программа выведет в консоль ap############# (15 символов, чтобы пользователь не
    мог узнать длину слова)
    d. Сравнение двух слов необходимо выполнять посимвольно.
    e. Игра продолжается до тех пор, пока игрок не угадает загаданное компьютером слово.*/

    public static void main(String[] args) {
        startProgram();
    }

    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    private static void startProgram() {
        String findWord = words[new Random().nextInt(words.length)];
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("Please enter a word: ");
            String userWord = scanner.nextLine();
            userWord = userWord.toLowerCase().trim();
            if (userWord.equals(findWord)) {
                isFinished = true;
                System.out.println("you guessed it!");
            } else {
                StringBuilder currentWord = new StringBuilder();
                char[] charsFind = findWord.toCharArray();
                char[] charsUser = userWord.toCharArray();
                for (int i = 0; i < 15; i++) {
                    if (i < charsFind.length && i < charsUser.length) {
                        if (charsFind[i] == charsUser[i]) {
                            currentWord.append(charsFind[i]);
                        } else {
                            currentWord.append('#');
                        }
                    } else {
                        currentWord.append('#');
                    }
                }
                System.out.println("Current attempt: " + currentWord + ". Try again.");
            }
        }
    }
}
