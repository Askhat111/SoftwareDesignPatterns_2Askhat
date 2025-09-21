package laptopfactory.products;

public class HPLaptop implements Laptop {
    @Override
    public String getBrand() { return "HP"; }
    @Override
    public String getModel() { return "Spectre x360"; }
    @Override
    public void showDetails() {
        System.out.println("HP Spectre x360 - Intel i7, 16GB RAM");
    }
}

