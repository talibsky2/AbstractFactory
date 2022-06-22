// Concrete product
public class Square implements LaserCutting {
    @Override
    public void useLaserCutter() {
        System.out.println("Cutting square");
    }

    @Override
    public void paintFigura() {
        System.out.println("Painting in black color");
    }
}
