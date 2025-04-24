package homework.lesson11.task1;

public abstract class AbstractFigure {

    private static double allAreaArray;

    public static double getAllAreaArray() {
        return allAreaArray;
    }

    public static void setAllAreaArray(double allAreaArray) {
        AbstractFigure.allAreaArray += allAreaArray;
    }
}
