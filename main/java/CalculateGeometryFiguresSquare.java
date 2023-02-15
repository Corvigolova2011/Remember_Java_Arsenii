import java.util.Scanner;

public class CalculateGeometryFiguresSquare {
    public static void main(String[] args) {
        String figureName = readGeometryFigureName();
        int figureNumber = returnNumberOfGeometryFigure(figureName);
        System.out.println("figureName" + figureName);

    }
    public static String readGeometryFigureName() {
        return new Scanner(System.in).next();

    }
    public static int returnNumberOfGeometryFigure(String figureName) {
        int figureNumber = 0;
       switch (figureName) {
           case "треугольник": return 1;
           case "круг": return 2;
           case "квадрат": return 3;
           case "Трапеция": return 4;
           default:
               System.out.println("нет такой фигуры в базе программы");
       }
       return figureNumber;
    }
    public static double calculateTriangleSqure(int height, int side) {

        return 0.5 * height * side;
    }
}
