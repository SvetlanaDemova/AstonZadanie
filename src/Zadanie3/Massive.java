package Zadanie3;
import java.util.Scanner;
public class Massive {
    public static void main(String[] args) {
        int n;
        int[] ar;
        System.out.println("введите любое целое число больше нуля - размерность массива");
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    {
                        ar = new int[n];
                        System.out.println("введите элементы массива (целые числа)");
                        System.out.println();
                        int i;
                        for (i = 0; i <= n - 1; i++) {
                            if (scanner.hasNextInt()) {
                                ar[i] = scanner.nextInt();
                                scanner.nextLine();
                            } else {
                                System.out.println("Неправильно, вам нужно ввести целое число. Попробуйте еще раз");
                                scanner.nextLine();
                                i = i - 1;
                            }
                        }
                        System.out.println("Введенный вами массив целых чисел:");
                        for (i = 0; i <= n - 1; i++)
                        {
                            System.out.print(ar[i]+" ");

                        }
                        System.out.println();
                        System.out.println("Элементы введенного вами массива, кратные 3:");
                        for (i = 0; i <= n - 1; i++)
                        { if (ar[i]%3==0)
                            System.out.print(ar[i]+" ");
                        }
                    }

                    break;
                } else {
                    System.out.println("Попробуйте еще раз, введенная размерность массива должна быть больше нуля");
                    scanner.nextLine();
                }


            } else {
                System.out.println("Неправильно. Попробуйте еще раз (введенный вами символ должен быть целым числом)");
                scanner.nextLine();
            }
        }
        while (true);
    }


}
