public class SportsCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void setBrand(String brand) {
        car.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
        car.setModel(model);
    }

    @Override
    public Car build() {
        return car;
    }
}
