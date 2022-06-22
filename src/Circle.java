// Concrete product
public class Circle implements LaserCutting{
    @Override
    public void useLaserCutter() {
        System.out.println("Cutting circle");
    }

    @Override
    public void paintFigura() {
        System.out.println("Painting in yellow color");
    }
}
