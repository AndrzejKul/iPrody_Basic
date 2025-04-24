package homework.lesson11.task1;

public class Print {

    public static void printEachAreaFigureArray(FigureArea[] figures) {
        System.out.println("В массиве " + figures.length + " фигур, а именно:");
        for (FigureArea figure : figures) {
            System.out.println(figure.getName() + " с площадью " + figure.calculateAreaFigure());
        }
    }

    public static void printAllAreaArray() {
        System.out.println("Общая площадь фигур массива - " + AbstractFigure.getAllAreaArray());
    }
}
