package homework.lesson11.task1;

public class Triangle implements FigureArea{
    private double baseLength;
    private double heightToBase;
    private final String name = "Треугольник";

    public Triangle(double baseLength, double heightToBase) {
        this.baseLength = baseLength;
        this.heightToBase = heightToBase;
    }

    @Override
    public Double calculateAreaFigure() {
        return 0.5 * this.baseLength * this.heightToBase;
    }

    public String getName() {
        return name;
    }
}
