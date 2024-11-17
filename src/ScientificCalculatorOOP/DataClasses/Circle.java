package ScientificCalculatorOOP.DataClasses;

import java.util.List;

public class Circle {
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public List<BaseData> getBaseDataList() {
        return baseDataList;
    }

    public void setBaseDataList(List<BaseData> baseDataList) {
        this.baseDataList = baseDataList;
    }

    private Double radius;
    private List<BaseData> baseDataList;
}
