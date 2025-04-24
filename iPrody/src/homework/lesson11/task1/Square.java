package homework.lesson11.task1;

public class Square implements FigureArea {

    private double sideLength;
    private final String name = "Квадрат";

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public Double calculateAreaFigure() {
        return this.sideLength * this.sideLength;
    }

    public String getName() {
        return name;
    }
}
