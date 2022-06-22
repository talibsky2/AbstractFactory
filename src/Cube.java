// Concrete product
public class Cube implements Printering3d{
    @Override
    public void use3dPrinter() {
        System.out.println("Printing cube");
    }

    @Override
    public void paintItem() {
        System.out.println("Painting cube in black color");
    }
}
