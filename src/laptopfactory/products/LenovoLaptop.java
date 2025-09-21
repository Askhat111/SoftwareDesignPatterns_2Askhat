package laptopfactory.products;

public class LenovoLaptop implements Laptop {
    @Override
    public String getBrand() { return "Lenovo"; }
    @Override
    public String getModel() { return "ThinkPad X1"; }
    @Override
    public void showDetails() {
        System.out.println("Lenovo ThinkPad X1 - Intel i7, 16GB RAM");
    }
}
