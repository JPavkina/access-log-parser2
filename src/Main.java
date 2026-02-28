import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        // Считываем первое число
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        // Считываем второе число
        int number2 = scanner.nextInt();
        // Вывод полученных чисел
        int result = number1 + number2;
        System.out.println("сумма: " + result);
        result = number1 - number2;
        System.out.println("разность: " + result);
        result = number1 * number2;
        System.out.println("произведение: " + result);
        double resultDouble = (double) number1 / number2;
        System.out.println("частное: " + resultDouble);
    }
}