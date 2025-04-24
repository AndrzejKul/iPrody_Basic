package homework.lesson11.task1;

public class Circle extends AbstractFigure implements FigureArea {
    private double radius;
    private final String name = "Круг";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateAreaFigure() {
        return Math.PI * this.radius * this.radius;
    }

    public String getName() {
        return name;
    }
}
