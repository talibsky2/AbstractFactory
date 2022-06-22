// Concrete product
public class Ball implements Printering3d{
    @Override
    public void use3dPrinter() {
        System.out.println("Printing ball");
    }

    @Override
    public void paintItem() {
        System.out.println("Painting ball in yellow color");
    }
}
