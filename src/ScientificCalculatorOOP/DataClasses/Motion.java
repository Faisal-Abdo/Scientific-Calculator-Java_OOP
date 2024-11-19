package ScientificCalculatorOOP.DataClasses;


public class Motion extends BaseData {
    private Double initialVelocity;
    private Double acceleration;
    private Double time;

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

    @Override
    public String toString() {
        return "Motion{" +
                "initialVelocity=" + initialVelocity +
                ", acceleration=" + acceleration +
                ", time=" + time +
                '}';
    }
}
