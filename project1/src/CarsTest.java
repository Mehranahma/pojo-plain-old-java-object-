public class CarsTest {
    public static void main(String[] args) {
        Cars obj1Cars = new Cars();
        obj1Cars.setBrand("Audi");
        obj1Cars.setColor("Black");

        System.out.println("Brand " + obj1Cars.getBrand() + "\nColor " + obj1Cars.getColor());
    }
}