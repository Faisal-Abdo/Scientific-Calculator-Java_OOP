package ScientificCalculatorOOP.DataClasses;

public class Physics {
    private Double mass;
    private Motion motionData;

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Motion getMotionData() {
        return motionData;
    }

    public void setMotionData(Motion motionData) {
        this.motionData = motionData;
    }

    @Override
    public String toString() {
        return "Physics{" +
                "mass=" + mass +
                ", motionData=" + motionData +
                '}';
    }
}