package homework.lesson10;

public class Cat extends Animal {

    private static int counterCat;

    public Cat(String type, int maxRun, int maxSwim) {
        super(type, maxRun, maxSwim);
        counterCat++;
    }

    static int getCounterCat() {
        return counterCat;
    }
}
