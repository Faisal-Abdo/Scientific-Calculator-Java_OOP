package ScientificCalculatorOOP.DataClasses;

import java.util.List;

public class Motion {
    private Double initialVelocity;
    private Double acceleration;
    private Double time;
    private List<BaseData> baseDataList;

    public Double getInitialVelocity() {
        return initialVelocity;
    }

    public void setInitialVelocity(Double initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public Double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Double acceleration) {
        this.acceleration = acceleration;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public List<BaseData> getBaseDataList() {
        return baseDataList;
    }

    public void setBaseDataList(List<BaseData> baseDataList) {
        this.baseDataList = baseDataList;
    }
}
