package ScientificCalculatorOOP.DataClasses;

public class Physics {
    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Double acceleration) {
        this.acceleration = acceleration;
    }

    public Motion getMotionData() {
        return motionData;
    }

    public void setMotionData(Motion motionData) {
        this.motionData = motionData;
    }

    private Double mass;
    private Double acceleration;
    private Motion motionData;
}
