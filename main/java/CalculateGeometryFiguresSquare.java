import java.util.Scanner;

public class CalculateGeometryFiguresSquare {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Программа расчёта геометрических фигур");
        selectGeometryFigure();
        System.out.println("Спасибо за использование программы");
    }

    public static void selectGeometryFigure() {
        System.out.println("Введите номер геометрической фигуры: \n" +
                "1 - Треугольник\n" +
                "2 - Круг\n" +
                "3 - Квадрат\n" +
                "4 - Трапеция\n" +
                "5 - Правильный многоугольник\n" +
                "6 - Эллипс\n");
        switch (scanner.nextInt()) {
            case 1: {
                System.out.println("Выбран расчет площади треугольника");
                System.out.println("Площадь заданного треугольника = " + calculateTriangleSquare());
            }
            ;
            break;
            case 2: {
                System.out.println("Выбран расчет площади круга");
                calculateCircleSquare();
            }
            ;
            break;
            case 3: {
                System.out.println("Выбран расчет площади квадрата");
                calculateSquareSquare();
            }
            ;
            break;
            case 4: {
                System.out.println("Выбран расчет площади трапеции");
                calculateTrapezoidSquare();
            }
            break;
            case 5: {
                System.out.println("Выбран расчет площади правильного многоугольника");
                calculateRegularPolygon();
            }
            break;
            case 6: {
                System.out.println("Выбран расчет площади эллипса");
                calculateEllipse();
            }
            break;
            default: {
                System.out.println("Нет такой фигуры в базе программы");
                break;
            }
        }
    }

    public static double calculateTriangleSquare() {
        System.out.println("Введите высоту треугольника");
        double height = scanner.nextDouble();
        System.out.println("Введите сторону треугольника");
        double side = scanner.nextDouble();
        return 0.5 * height * side;
    }

    public static double calculateCircleSquare() {
        System.out.println("Введите длинну радиуса окружности");
        return Math.PI * Math.pow(scanner.nextDouble(), 2);
    }

    public static double calculateSquareSquare() {
        System.out.println("Введите длинну стороны квадрата");
        return Math.pow(scanner.nextDouble(), 2);
    }

    public static double calculateTrapezoidSquare() {
        System.out.println("Введите длинну первой паралельной стороны трапеции");
        double side = scanner.nextDouble();
        System.out.println("Введите длинну второй паралельной стороны трапеции");
        double secondSide = scanner.nextDouble();
        System.out.println("Введите длинну высоты трапеции");
        double height = scanner.nextDouble();
        return 0.5 * (side + secondSide) * height;
    }

    public static double calculateRegularPolygon() {
        System.out.println("Введите количество сторон правильного многоугольника");
        long sidesNumber = scanner.nextLong();
        System.out.println("Введите длинну стороны правильного многоугольника");
        double side = scanner.nextDouble();
        return sidesNumber / 4 * Math.pow(side, 2) * 1 / Math.tan(Math.PI / sidesNumber);
    }

    public static double calculateEllipse() {
        System.out.println("Введите длинну первой полуоси эллипса");
        double semiAxisA = scanner.nextDouble();
        System.out.println("Введите длинну второй полуоси эллипса");
        double semiAxisB = scanner.nextDouble();
        return Math.PI * semiAxisA * semiAxisB;
    }
}
