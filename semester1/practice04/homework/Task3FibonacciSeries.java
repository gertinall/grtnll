package semester1.practice04.homework;

import java.util.Scanner;

public class Task3FibonacciSeries {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЧИСЛА ФІБОНАЧЧІ ТА ЗОЛОТИЙ ПЕРЕТИН ===");

        System.out.print("Скільки чисел згенерувати (N >= 3): ");
        int n = scanner.nextInt();

        if (n < 3 || n > 30) {
            System.out.println("Помилка: N має бути від 3 до 30. Завершення роботи.");
            return;
        }

        int f1 = 1;
        int f2 = 1;
        double ratio = 0.0;

        System.out.println("----------------------------------------------");
        System.out.println("№ 1  | Число: " + f1);
        System.out.println("№ 2  | Число: " + f2);

        for (int i = 3; i <= n; i++) {
            int next = f1 + f2;
            ratio = (double) next / f2;

            String formattedRatio = String.format("%.6f", ratio);
            System.out.println("№ " + i + "  | Число: " + next + "       | Відношення F(n)/F(n-1) = " + formattedRatio);

            f1 = f2;
            f2 = next;
        }

        System.out.println("----------------------------------------------");
        System.out.println("Підсумок: знайдено наближення Золотого перетину: " + String.format("%.6f", ratio));
        System.out.println("Еталонне значення:                              " + String.format("%.6f", 1.618034));
        System.out.println("==============================================");

        scanner.close();
    }
}