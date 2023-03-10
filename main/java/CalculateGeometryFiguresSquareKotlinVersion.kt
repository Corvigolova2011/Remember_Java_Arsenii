import java.util.*

object CalculateGeometryFiguresSquareKotlinVersion {
    private val scanner = Scanner(System.`in`)
    @JvmStatic
    fun main(args: Array<String>) {
        println("Программа расчёта геометрических фигур")
        selectGeometryFigure()
        println("Спасибо за использование программы")
    }

    fun selectGeometryFigure() {
        println("Введите номер геометрической фигуры: \n" +
                "1 - Треугольник\n" +
                "2 - Круг\n" +
                "3 - Квадрат\n" +
                "4 - Трапеция\n" +
                "5 - Правильный многоугольник\n" +
                "6 - Эллипс\n")
        when (scanner.nextInt()) {
            1 -> {
                run {
                    println("Выбран расчет площади треугольника")
                    println("Площадь заданного треугольника = " + calculateTriangleSquare())
                }
            }

            2 -> {
                run {
                    println("Выбран расчет площади круга")
                    calculateCircleSquare()
                }
            }

            3 -> {
                run {
                    println("Выбран расчет площади квадрата")
                    calculateSquareSquare()
                }
            }

            4 -> {
                println("Выбран расчет площади трапеции")
                calculateTrapezoidSquare()
            }

            5 -> {
                println("Выбран расчет площади правильного многоугольника")
                calculateRegularPolygon()
            }

            6 -> {
                println("Выбран расчет площади эллипса")
                calculateEllipse()
            }

            else -> {
                println("Нет такой фигуры в базе программы")
            }
        }
    }

    fun calculateTriangleSquare(): Double {
        println("Введите высоту треугольника")
        val height = scanner.nextDouble()
        println("Введите сторону треугольника")
        val side = scanner.nextDouble()
        return 0.5 * height * side
    }

    fun calculateCircleSquare(): Double {
        println("Введите длинну радиуса окружности")
        return Math.PI * Math.pow(scanner.nextDouble(), 2.0)
    }

    fun calculateSquareSquare(): Double {
        println("Введите длинну стороны квадрата")
        return Math.pow(scanner.nextDouble(), 2.0)
    }

    fun calculateTrapezoidSquare(): Double {
        println("Введите длинну первой паралельной стороны трапеции")
        val side = scanner.nextDouble()
        println("Введите длинну второй паралельной стороны трапеции")
        val secondSide = scanner.nextDouble()
        println("Введите длинну высоты трапеции")
        val height = scanner.nextDouble()
        return 0.5 * (side + secondSide) * height
    }

    fun calculateRegularPolygon(): Double {
        println("Введите количество сторон правильного многоугольника")
        val sidesNumber = scanner.nextLong()
        println("Введите длинну стороны правильного многоугольника")
        val side = scanner.nextDouble()
        return sidesNumber / 4 * Math.pow(side, 2.0) * 1 / Math.tan(Math.PI / sidesNumber)
    }

    fun calculateEllipse(): Double {
        println("Введите длинну первой полуоси эллипса")
        val semiAxisA = scanner.nextDouble()
        println("Введите длинну второй полуоси эллипса")
        val semiAxisB = scanner.nextDouble()
        return Math.PI * semiAxisA * semiAxisB
    }
}