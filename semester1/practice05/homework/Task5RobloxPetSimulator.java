package semester1.practice05.homework;

import java.util.Scanner;

public class Task5RobloxPetSimulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] petNames = {"Dog", "Cat", "Dragon", "Unicorn", "Huge Titanic Cat"};
        String[] petIcons = {"🐶", "🐱", "🐉", "🦄", "💎"};
        int[] petPowers = {15, 25, 120, 350, 2000};
        int[] dropChances = {45, 30, 15, 8, 2};

        String[] inventoryNames = new String[8];
        int[] inventoryPowers = new int[8];
        int petCount = 0;

        int coins = 300;
        int eggPrice = 100;
        boolean running = true;

        while (running){
            System.out.println("======================================================");
            System.out.println("           🐾 ROBLOX: PET SIMULATOR 🐾");
            System.out.println("======================================================");
            System.out.println("Баланс: " + coins + " монет | Вихованців у рюкзаку: " + petCount + "/" + inventoryNames.length);
            System.out.println();
            System.out.println("1 - Відкрити чарівне яйце (" + eggPrice + " монет)");
            System.out.println("2 - Відкрити рюкзак-інвентар");
            System.out.println("3 - Порахувати силу команди");
            System.out.println("4 - Фармити монети (+50..150 монет)");
            System.out.println("0 - Вийти з гри");
            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    if (coins < eggPrice){
                        System.out.println("Недостатньо монет! Потрібно " + eggPrice + ", у вас " + coins);
                    } else if (petCount >= inventoryNames.length){
                        System.out.println("Рюкзак переповнений! Продайте або видаліть зайвих петів");
                    } else {
                        int roll = (int)(Math.random() * 100) + 1;
                        int sum = 0;
                        int index = 0;
                        for (int i = 0; i < dropChances.length; i++){
                            sum += dropChances[i];
                            if (roll <= sum){
                                index = i;
                                break;
                            }
                        }
                        coins -= eggPrice;
                        inventoryNames[petCount] = petNames[index];
                        inventoryPowers[petCount] = petPowers[index];
                        petCount++;

                        System.out.println("🥚 Трісь! Яйце розколюється...");
                        if (index == 4){
                            System.out.println("⭐⭐⭐ НЕЙМОВІРНО! СУПЕР-ДЖЕКПОТ! ⭐⭐⭐");
                            System.out.println(petIcons[index] + " " + petNames[index] + "! (Сила: " + petPowers[index] + ")");
                            System.out.println("Залишок монет: " + coins);
                        } else {
                            System.out.println("✨ ВАМ ВИПАВ: " + petIcons[index] + " " + petNames[index] + "! (Сила: " + petPowers[index] + ")");
                            System.out.println("Вихованця додано в інвентар! Залишок монет: " + coins);
                        }
                    }
                    break;

                case 2:
                    if (petCount == 0){
                        System.out.println("Рюкзак порожній.");
                    } else {
                        System.out.println("--- ВАШ РЮКЗАК ---");
                        for (int i = 0; i < petCount; i++){
                            System.out.println("[Слот " + (i + 1) + "] " + inventoryNames[i] + " (Сила: " + inventoryPowers[i] + ")");
                        }
                    }
                    break;

                case 3:
                    if (petCount == 0){
                        System.out.println("У вас ще немає вихованців!");
                    } else {
                        int totalPower = 0;
                        int bestIndex = 0;
                        for (int i = 0; i < petCount; i++){
                            totalPower += inventoryPowers[i];
                            if (inventoryPowers[i] > inventoryPowers[bestIndex]){
                                bestIndex = i;
                            }
                        }
                        System.out.println("--- СТАТИСТИКА ВАШОЇ КОМАНДИ ---");
                        System.out.println("Кількість вихованців: " + petCount + " шт.");
                        System.out.println("Загальна сила команди: " + totalPower + " очок шкоди");
                        System.out.println("🔥 Найсильніший улюбленець: " + inventoryNames[bestIndex] + " (Сила: " + inventoryPowers[bestIndex] + ")");
                    }
                    break;

                case 4:
                    int earned = (int)(Math.random() * 101) + 50;
                    coins += earned;
                    System.out.println("💰 Ви розбили монети на локації і отримали +" + earned + " монет!");
                    System.out.println("Баланс: " + coins);
                    break;

                case 0:
                    System.out.println("Дякуємо за гру! До зустрічі!");
                    running = false;
                    break;

                default:
                    System.out.println("Невідома команда, спробуйте ще раз.");
            }
            System.out.println();
        }
    }
}