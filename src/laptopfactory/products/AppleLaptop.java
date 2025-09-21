package laptopfactory.products;

public class AppleLaptop implements Laptop {
    @Override
    public String getBrand() { return "Apple"; }
    @Override
    public String getModel() { return "MacBook Pro"; }
    @Override
    public void showDetails() {
        System.out.println("Apple MacBook Pro - M1, 16GB RAM");
    }
}


