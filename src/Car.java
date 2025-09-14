public class Car {
    private String brand;
    private String model;

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }

    @Override
    public String toString() {
        return "brand:" + brand + ", model:" + model;
    }
}
