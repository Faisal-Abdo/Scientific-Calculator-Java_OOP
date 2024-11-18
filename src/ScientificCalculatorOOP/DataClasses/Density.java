package ScientificCalculatorOOP.DataClasses;

public class Density extends BaseData {
    private Double volume;
    private Physics physics;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Physics getPhysics() {
        return physics;
    }

    public void setPhysics(Physics physics) {
        this.physics = physics;
    }
}
