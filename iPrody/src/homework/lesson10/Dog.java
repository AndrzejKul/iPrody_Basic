package homework.lesson10;

public class Dog extends Animal {

    private static int counterDog;

    public Dog(String type, int maxRun, int maxSwim) {
        super(type, maxRun, maxSwim);
        counterDog++;
    }

    static int getCounterDog() {
        return counterDog;
    }
}
