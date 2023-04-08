package Zadanie2;
import java.util.Scanner;
public class PrivetViacheslav {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите мужское имя");

        String str = scanner.nextLine();

               if (str == "Вячеслав")
        {
            System.out.println("Привет, Вячеслав");
        }
        else {System.out.println("Нет такого имени");}


    }
}
