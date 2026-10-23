package semester1.practice03;

import java.util.Scanner;

public class Practice03_Polishchuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //завд 1
        System.out.print("Ім'я: ");
        String name = scanner.nextLine();

        System.out.print("Прізвище: ");
        String lastName = scanner.nextLine();

        System.out.print("Вік: ");
        int age = scanner.nextInt();

        System.out.print("Місце проживання: ");
        String fullName = scanner.nextLine();
        scanner.nextLine();

        //завд 2
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Сума: " + (a + b));
        System.out.println("Різниця: " + (a - b));
        System.out.println("Добуток: " + (a * b));
        System.out.print("Остача від ділення: " + (a % b));
        scanner.nextLine();

        //завдання 3

        System.out.print("Введіть суму в гривнях (UAH): ");
        double uah = scanner.nextDouble();

        System.out.print("Введіть курс USD: ");
        double rate = scanner.nextDouble();

        double usd = uah / rate;
        double roundedUsd = Math.round(usd * 100.0) / 100.0;
        System.out.println("Сума до видачі: " + roundedUsd + " USD");
        scanner.nextLine();

        //завдання 4

        System.out.print("Введіть номер квитка: ");
        int ticket = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть повне ім'я студента: ");
        String studentName = scanner.nextLine();

        System.out.print("Введіть спеціальність: ");
        String speciality = scanner.nextLine();

        System.out.print("Студент " + studentName + ", квиток №" + ticket + ", спеціальність: " + speciality);
        scanner.nextLine();

        // завдання 5

        System.out.print("Ваш зріст (м): ");
        double height = scanner.nextDouble();

        System.out.print("Ваша вага (кг): ");
        double weight = scanner.nextDouble();

        double BMI = (weight / (height * height));
        System.out.println("Розрахований BMI: " + BMI);

        //завдання 6

        System.out.println("Введіть символ: ");
        double symbol = scanner.next().charAt(0);

        
        scanner.close();
    }
}
