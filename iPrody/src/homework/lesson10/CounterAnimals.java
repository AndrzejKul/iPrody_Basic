package homework.lesson10;

public class CounterAnimals {

    public static void printCounterAnimals() {
        System.out.println("В данном проекте участвуют:\nКошек: " + Cat.getCounterCat()
                + "\nСобак: " + Dog.getCounterDog() + "\nВсего животных: " + Animal.getCounterAnimal());
    }
}
