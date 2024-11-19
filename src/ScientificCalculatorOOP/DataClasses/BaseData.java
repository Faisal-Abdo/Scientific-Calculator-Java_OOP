package ScientificCalculatorOOP.DataClasses;


public class BaseData {
   /* private String id;
    private String description;*/
    private String unit;

   /* public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }*/

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                /*"id='" + id + '\'' +
                ", description='" + description + '\'' +*/
                ", unit='" + unit + '\'' +
                '}';
    }
}
