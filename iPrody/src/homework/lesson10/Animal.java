package homework.lesson10;

public abstract class Animal {
    private String type;
    private int maxRun;
    private int maxSwim;
    private static int counterAnimal;

    private Animal() {
    }

    protected Animal(String type, int maxRun, int maxSwim) {
        Animal.counterAnimal++;
        this.type = type;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    static int getCounterAnimal() {
        return counterAnimal;
    }

    public void run(int length) {
        if (this.maxRun <= 0) {
            System.out.println(this.type + " не умеет бегать.");
        } else if (length > this.maxRun) {
            System.out.println(this.type + " смог пробежать " + this.maxRun + " м. Оставшиеся "
                    + (length - this.maxRun) + " м. он пойдет пешком.");
        } else {
            System.out.println(this.type + " пробежал " + length + "м.");
        }
    }

    public void swim(int length) {
        if (this.maxSwim <= 0) {
            System.out.println(this.type + " не умеет плавать.");
        } else if (length > this.maxSwim) {
            System.out.println(this.type + " смог проплыть " + this.maxSwim + " м. Оставшиеся "
                    + (length - this.maxSwim) + " м. он не поплывет.");
        } else {
            System.out.println(this.type + " проплыл " + length + "м.");
        }
    }
}
