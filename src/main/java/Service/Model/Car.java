package Service.Model;

public class Car {
    private String model;
    private String licensePlate;
    private String color;

    public Car(String model, String licensePlate, String color) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "this car's model is '" + model + ", licensePlate - " + licensePlate + " and color - " + color;
    }
}
