package lesson10.Figures;

public class BaseFigure {
    private String fillColor;
    private String borderColor;

    public BaseFigure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
