package lesson10.Figures;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("white", "red", 50, 6);
        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter());
        System.out.println("Цвет заливки прямоугольника: " + rectangle1.getFillColor());
        System.out.println("Цвет границы прямоугольника: " + rectangle1.getBorderColor());

        Triangle triangle1 = new Triangle("blue", "red", 5, 6,8);
        System.out.println("\nПлощадь треугольника: " + triangle1.calculateArea());
        System.out.println("Периметр треугольника: " + triangle1.calculatePerimeter());
        System.out.println("Цвет заливки треугольника: " + triangle1.getFillColor());
        System.out.println("Цвет границы треугольника: " + triangle1.getBorderColor());

        Circle circle1 = new Circle("black", "yellow", 9);
        System.out.println("\nПлощадь круга: " + circle1.calculateArea());
        System.out.println("Периметр круга: " + circle1.calculatePerimeter());
        System.out.println("Цвет заливки круга: " + circle1.getFillColor());
        System.out.println("Цвет границы круга: " + circle1.getBorderColor());


    }
}
