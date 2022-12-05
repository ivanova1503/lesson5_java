import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x:");
        double x= scanner.nextDouble();
        System.out.println("Введите число y:");
        double y= scanner.nextDouble();
        System.out.println("Введите знак арифметического действия (+ - * /): ");
        String key = scanner.next();
        scanner.close();

        double result=0;

        switch(key) {
            case ("+"): result=x+y; break;
            case ("-"): result=x-y; break;
            case ("*"): result=x*y; break;
            case ("/"): result=x/y; break;
            default:
                System.out.println("Неверный знак: " + key);
                break;
        }

        System.out.println("Результат: " + result);
    }
}