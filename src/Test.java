import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter color: ");
        String color = in.nextLine();
        FiguraFactory factory = choiceByColor(color);
        LaserCutting a = factory.cutting();
        Printering3d b = factory.printing();
        a.useLaserCutter();
        a.paintFigura();
        b.use3dPrinter();
        b.paintItem();
    }
    public static FiguraFactory choiceByColor (String color) {
        return switch (color) {
            case "black" -> new BlackItem();
            case "yellow" -> new YellowItem();
            default -> null;
        };
    }

}