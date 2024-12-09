package lesson10.Figures;

public class Rectangle extends BaseFigure implements FigureInterface {

    private double width;
    private double height;


    public Rectangle(String fillColor, String borderColor, double width, double height) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double calculatePerimeter() {
        return (getWidth() + getHeight()) * 2;
    }
}
