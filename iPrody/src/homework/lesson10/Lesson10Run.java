package homework.lesson10;

public class Lesson10Run {
    public static void main(String[] args) {
        Cat tiger = new Cat("Тигр", 500, 300);
        Cat lion = new Cat("Старый Лев", 0, 0);
        Dog husky = new Dog("Хаски", 2000, 500);

        lion.run(100);
        tiger.run(2000);
        husky.run(23);
        husky.swim(600);
        CounterAnimals.printCounterAnimals();


    }
}
