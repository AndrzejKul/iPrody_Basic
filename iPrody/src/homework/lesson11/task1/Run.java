package homework.lesson11.task1;

import java.util.Random;

public class Run {

    public static void main(String[] args) {
        FigureArea[] figures = new FigureArea[new Random().nextInt(2, 11)];
        BasicFigure[] basicFigure = BasicFigure.values();

        FillAndCalculate.fillFiguresArray(figures, basicFigure);
        FillAndCalculate.sumAreaArray(figures);
        Print.printEachAreaFigureArray(figures);
        Print.printAllAreaArray();
    }
}
