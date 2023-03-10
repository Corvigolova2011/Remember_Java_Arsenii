import java.util.Scanner;
/**
 * с клавиатуры вводятся строки содержащие буквы или строки содержащие и первую букву i  и затем цифры
 * 1. Считать строку с консоли и сохранить ее в переменную.
 * 2. Если строка содержит первый символ == 'i' то удалить этот символ,
 * преобразовать в число и к полученному числовому значению добавить 1 и вывести число на экран
 * 3. Если первый символ строки содержит == 's' то удалить этот символ и вывести остаток строки в обратном порядке символов
 * 4. Если введена пустая строка или другие строки без символов как в пп.1 или 2. то просто вывести ее на экран.
 * Рекомендации: в Java использовать Scanner, switch() { },
 * и методы string или StringBuilder (методы deleteCharAt(), reverse())=
 * которые можно подсмотреть в IDEA если около вашей введенной строки поставить точку  (аналогично в Kotlin
 * .first() returns the first symbol of the string.
 * .isEmpty() returns true if the string has no symbols, otherwise, it returns false.
 * .drop(n) removes n first symbols from the string and returns the resulting string.
 * .reversed() returns the reversed string.
 * .toInt() converts the string to an integer and returns it.
 * Примеры ввода и результата:
 * Ввод: "i123"
 * Вывод: 124
 * Ввод: "sabc"
 * Вывод: cba
 * Ввод: "    "
 * Вывод: */
public class Homework {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        if (stringBuilder.charAt(0) == 'i') {
            System.out.println((Integer.parseInt(stringBuilder.delete(0, 1).toString()) + 1));
        } else if (stringBuilder.charAt(0) == 's') {
            System.out.println((stringBuilder.delete(0, 1).reverse()));
        } else System.out.println(str);
    }
}
