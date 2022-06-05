public class FruitTest {
    public static void main(String args[])
    {
        Fruit objFruit = new Fruit();
        objFruit.setName("Apple");
        objFruit.setColour("Red");

        System.out.println("Name " + objFruit.getName() + "\t Colour " + objFruit.getColour());
    }
}
