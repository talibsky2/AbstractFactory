// Concrete creator
public class BlackItem implements FiguraFactory {
    @Override
    public LaserCutting cutting() {
        return new Square();
    }

    @Override
    public Printering3d printing() {
        return new Cube();
    }
}
