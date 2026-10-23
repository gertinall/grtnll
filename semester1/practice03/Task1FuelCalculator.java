package semester1.practice03;

import java.util.Scanner;

public class Task1FuelCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");

        System.out.println("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();

        System.out.println("Введіть середню витрату на 100 км (л): ");
        double fuelConsumption = scanner.nextDouble();

        System.out.println("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();

        if (fuelType <= 0 || fuelConsumption <= 0 || fuelType < 1 || fuelType > 3) {
            System.out.println("Помилка і завершення роботи.");
            return;
        }

        double pricePerLiter;
        String fuelName;
        switch (fuelType) {
            case 1: pricePerLiter = 56.50; fuelName = "Бензин А-95";
               break;
            case 2: pricePerLiter = 52.80; fuelName = "Дизель";
                break;
            case 3: pricePerLiter = 29.40; fuelName = "Газ";
                break;
            default:
                System.out.println("Невідомий тип пального.");
            return;
        }

        double neededFuel = (distance * fuelConsumption) / 100.0;
        double baseCost = neededFuel * pricePerLiter;
        double finalCost = (baseCost >= 2000.0) ? baseCost * 0.95 : baseCost;
        double discount = baseCost - finalCost;

        System.out.println("---------------- ЗВІТ ПОЇЗДКИ ----------------");
        System.out.println("Обране пальне:               " + fuelType + " (" + pricePerLiter + " грн/л)");
        System.out.println("Необхідно пального:          " + neededFuel + " л");
        System.out.println("Знижка АЗС (5%):             " + discount + " грн");
        System.out.println("----------------------------------------------");
        System.out.println("Підсумкова сума до сплати:   " + finalCost + " грн");
        System.out.println("==============================================");

        scanner.close();
    }
}
