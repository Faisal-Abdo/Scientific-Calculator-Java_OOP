package ScientificCalculatorOOP.DataClasses;

public class Interest extends BaseData {
    private Double principal;
    private Double rate;
    private Double time;

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "principal=" + principal +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}