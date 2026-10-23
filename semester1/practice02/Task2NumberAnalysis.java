package semester1.practice02;

public class Task2NumberAnalysis {
    public static void main(String[] args) {
        int number = 742;

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;
        int reversedNumber = units * 100 + tens + 10 + hundreds;
        boolean isSumEven = sum % 2 == 0;

        System.out.println("Початкове число:\t\t\t" + number);
        System.out.println("Розряди:\t\t\t\t\tСотні = " + hundreds + ", Десятки = " + tens + ", Одиниці = " + units);
        System.out.println("Сума цифр:\t\t\t\t\t" + sum);
        System.out.println("Добуток цифр:\t\t\t\t" + product);
        System.out.println("Перевернуте число:\t\t\t" + reversedNumber);
        System.out.println("Чи є сума цифр парною?\t\t" + isSumEven);
    }
}

