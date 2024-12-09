package lesson10.Figures;

public class Triangle extends BaseFigure implements FigureInterface {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String fillColor, String borderColor, double sideA, double sideB, double sideC) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double calculateArea() {
        if (getSideA() <= 0 || getSideB() <= 0 || getSideC() <= 0) {
            throw new IllegalArgumentException("Все стороны треугольника должны быть положительными.");
        }

        // Проверка неравенства треугольника
        if ((getSideA() + getSideB() <= getSideC()) || (getSideA() + getSideC() <= getSideB()) || (getSideB() + getSideC() <= getSideA())) {
            throw new IllegalArgumentException("Сумма любых двух сторон должна быть больше третьей.");
        }
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    @Override
    public double calculatePerimeter() {
        if (getSideA() <= 0 || getSideB() <= 0 || getSideC() <= 0) {
            throw new IllegalArgumentException("Все стороны треугольника должны быть положительными.");
        }

        // Проверка неравенства треугольника
        if ((getSideA() + getSideB() <= getSideC()) || (getSideA() + getSideC() <= getSideB()) || (getSideB() + getSideC() <= getSideA())) {
            throw new IllegalArgumentException("Сумма любых двух сторон должна быть больше третьей.");
        }

        return getSideA() + getSideB() + getSideC();
    }
}
