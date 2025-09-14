public class CarDirector {
    public Car constructFamilyCar(CarBuilder builder) {
        builder.setBrand("Chevrolet");
        builder.setModel("Cobalt");
        return builder.build();
    }

    public Car constructSportsCar(CarBuilder builder) {
        builder.setBrand("Toyota");
        builder.setModel("Supra");
        return builder.build();
    }
}
