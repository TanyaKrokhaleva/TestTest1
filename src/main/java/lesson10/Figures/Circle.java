package lesson10.Figures;

public class Circle extends BaseFigure implements FigureInterface {

    private double radius;


    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
