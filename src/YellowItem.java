// Concrete creator
public class YellowItem implements FiguraFactory {
    @Override
    public LaserCutting cutting() {
        return new Circle();
    }

    @Override
    public Printering3d printing() {
        return new Ball();
    }
}
