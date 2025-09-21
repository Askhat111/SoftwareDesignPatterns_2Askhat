package laptopfactory.products;

public class AppleGamingLaptop implements Laptop {
    @Override
    public String getBrand() { return "Apple"; }
    @Override
    public String getModel() { return "MacBook Pro Gaming Edition"; }
    @Override
    public void showDetails() {
        System.out.println("Apple MacBook Pro Gaming Edition - M1 Max, 32GB RAM");
    }
}
