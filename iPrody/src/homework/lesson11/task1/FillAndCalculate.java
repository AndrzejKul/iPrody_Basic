package homework.lesson11.task1;

import java.util.Random;

public class FillAndCalculate {
    private final static Random random = new Random();

    public static void fillFiguresArray(FigureArea[] figures, BasicFigure[] basicFigure) {
        for (int i = 0; i < figures.length; i++) {
            figures[i] = switch (basicFigure[random.nextInt(0, BasicFigure.values().length)]) {
                case CIRCLE -> new Circle(random.nextInt(1, 10));
                case SQUARE -> new Square(random.nextInt(1, 10));
                case TRIANGLE -> new Triangle(random.nextInt(1, 10),
                        new Random().nextInt(1, 10));
            };
        }
    }

    public static void sumAreaArray(FigureArea[] figures) {
        for (FigureArea figure : figures) {
            AbstractFigure.setAllAreaArray(figure.calculateAreaFigure());
        }
    }
}
