package Zadanie1variant2;
import java.util.Scanner;
public class Privet2variant {
    public static void main(String[] args) {
        double a;
        System.out.println("введите любое число");
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                if (a > 7) {
                    System.out.println("Привет");
                    break;
                } else {
                    System.out.println("Попробуйте еще раз");
                    scanner.nextLine();
                }


            } else {
                System.out.println("Неправильно. Попробуйте еще раз (введенный вами символ должен быть числом)");
                scanner.nextLine();
            }
        }
        while (true);
    }


}
