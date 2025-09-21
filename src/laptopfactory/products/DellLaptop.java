package laptopfactory.products;

public class DellLaptop implements Laptop {
    @Override
    public String getBrand() { return "Dell"; }
    @Override
    public String getModel() { return "XPS 15"; }
    @Override
    public void showDetails() {
        System.out.println("Dell XPS 15 - Intel i7, 16GB RAM");
    }
}
