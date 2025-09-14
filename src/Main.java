public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new SportsCarBuilder();

        Car sportsCar = director.constructSportsCar(builder);
        Car familyCar = director.constructFamilyCar(new SportsCarBuilder());

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}
