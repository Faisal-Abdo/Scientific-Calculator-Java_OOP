package ScientificCalculatorOOP.DataClasses;


public class Circle {
    private Double radius;
    private BaseData baseData;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", baseData=" + baseData +
                '}';
    }
}