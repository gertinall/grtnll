package semester1.practice04.homework;

import java.util.Scanner;

public class Task5BrawlStarsArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("           ⭐ BRAWL STARS: BOSS FIGHT ⭐");
        System.out.println("======================================================");

        System.out.println("Оберіть свого бійця:");
        System.out.println("1. Шеллі (Shelly)     - HP: 4000 | Атака: 1200 | Супер: 2800");
        System.out.println("2. Кольт (Colt)       - HP: 3000 | Атака: 1600 | Супер: 3600");
        System.out.println("3. Ель Прімо (Primo)  - HP: 6000 | Атака: 1100 | Супер: 2200");
        System.out.print("Ваш вибір (1-3): ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Помилка: невірний вибір бійця.");
            scanner.close();
            return;
        }

        String brawlerName;
        int playerMaxHp;
        int baseAttack;
        int superAttack;

        switch (choice) {
            case 1:
                brawlerName = "Шеллі";
                playerMaxHp = 4000;
                baseAttack = 1200;
                superAttack = 2800;
                break;
            case 2:
                brawlerName = "Кольт";
                playerMaxHp = 3000;
                baseAttack = 1600;
                superAttack = 3600;
                break;
            default: // case 3
                brawlerName = "Ель Прімо";
                playerMaxHp = 6000;
                baseAttack = 1100;
                superAttack = 2200;
                break;
        }

        System.out.println("Ви обрали бійця: " + brawlerName + "! Бій починається!");

        int playerHp = playerMaxHp;
        int bossMaxHp = 10000;
        int bossHp = bossMaxHp;
        int bossBaseDamage = 700;

        int ammo = 3;
        int maxAmmo = 3;
        int superCharge = 0;

        int powerCubes = 0;
        int round = 0;
        boolean bossStunned = false;
        boolean bossWeakened = false;

        while (playerHp > 0 && bossHp > 0) {
            round++;

            if (ammo < maxAmmo) {
                ammo++;
            }

            double bossHpPercent = (double) bossHp / bossMaxHp;
            int bossDamage;
            String bossPhase;
            if (bossHpPercent > 0.60) {
                bossDamage = bossBaseDamage;
                bossPhase = "СПОКІЙНИЙ (Шкода: " + bossDamage + ")";
            } else if (bossHpPercent >= 0.30) {
                bossDamage = (int) (bossBaseDamage * 1.3);
                bossPhase = "⚠️ ANGRY! (+30% атаки, Шкода: " + bossDamage + ")";
            } else {
                bossDamage = (int) (bossBaseDamage * 1.7);
                bossPhase = "🔥 ENRAGED / GOD MODE (+70% атаки, Шкода: " + bossDamage + ")";
            }

            System.out.println();
            System.out.println("-------------------- РАУНД " + round + " --------------------");

            int playerBars = (int) (((double) playerHp / playerMaxHp) * 10);
            System.out.print("[" + brawlerName + "]     HP: [");
            for (int i = 0; i < 10; i++) {
                System.out.print(i < playerBars ? "█" : "░");
            }
            System.out.println("] " + playerHp + "/" + playerMaxHp
                    + " | Набої: " + ammo + "/" + maxAmmo
                    + " | Супер: [" + superBar(superCharge) + "] " + superCharge + "%"
                    + (superCharge >= 100 ? " (ГОТОВИЙ!)" : ""));

            int bossBars = (int) (((double) bossHp / bossMaxHp) * 10);
            System.out.print("[Робо-Бос]  HP: [");
            for (int i = 0; i < 10; i++) {
                System.out.print(i < bossBars ? "█" : "░");
            }
            System.out.println("] " + bossHp + "/" + bossMaxHp + " | Фаза: " + bossPhase);

            System.out.println("Куби підсилення: " + powerCubes + " шт."
                    + (powerCubes > 0 ? " (+" + (powerCubes * 15) + "% до атаки)" : ""));

            System.out.println();
            System.out.println("Оберіть дію:");
            System.out.println("1 - Базова атака (-1 набій)");
            System.out.println("2 - СУПЕР АТАКА" + (superCharge >= 100 ? "" : " (Не заряджено!)"));
            System.out.println("3 - Захисний маневр (відновлення набоїв та +15% HP)");
            System.out.println("4 - Ризик: пошук Енергетичного куба (Power Cube)");
            System.out.print("Ваш хід: ");
            int action = scanner.nextInt();

            double damageMultiplier = 1.0 + (powerCubes * 0.15);

            if (action == 1) {
                if (ammo > 0) {
                    ammo--;
                    int dealt = (int) (baseAttack * damageMultiplier);
                    bossHp -= dealt;
                    superCharge += 35;
                    if (superCharge > 100) superCharge = 100;
                    System.out.println();
                    System.out.println("💥 " + brawlerName + " влучно атакує! Завдано " + dealt + " шкоди!");
                    System.out.println("🔋 Заряд супера: +35% (Поточний: " + superCharge + "%)");
                } else {
                    System.out.println();
                    System.out.println("⚠️ Немає набоїв! Хід витрачено на перезарядку.");
                }
            } else if (action == 2) {
                if (superCharge >= 100) {
                    int dealt = (int) (superAttack * damageMultiplier);
                    bossHp -= dealt;
                    superCharge = 0;
                    System.out.println();
                    System.out.println("💣💣💣 СУПЕР-АТАКА «" + superTitle(brawlerName) + "»!");
                    System.out.println(brawlerName + " трощить усе навколо! Завдано " + dealt + " шкоди!");
                    if (brawlerName.equals("Шеллі")) {
                        bossWeakened = true;
                        System.out.println("Боса відкинуто вибухом! Наступна атака боса -50%!");
                    } else if (brawlerName.equals("Ель Прімо")) {
                        bossStunned = true;
                        System.out.println("Бос ОГЛУШЕНИЙ і пропустить наступний хід!");
                    }
                } else {
                    System.out.println();
                    System.out.println("⚠️ Супер ще не заряджений! Обрано базову атаку замість нього.");
                }
            } else if (action == 3) {
                int healed = (int) (playerMaxHp * 0.15);
                playerHp += healed;
                if (playerHp > playerMaxHp) playerHp = playerMaxHp;
                ammo += 2;
                if (ammo > maxAmmo) ammo = maxAmmo;
                System.out.println();
                System.out.println("🛡️ " + brawlerName + " виконує захисний маневр! +" + healed + " HP, набої відновлено.");
            } else if (action == 4) {
                if (Math.random() < 0.6) {
                    powerCubes++;
                    System.out.println();
                    System.out.println("💎 Знайдено Енергетичний куб! Тепер шкода +" + (powerCubes * 15) + "%.");
                } else {
                    System.out.println();
                    System.out.println("💨 Куб не знайдено. Пощастить наступного разу.");
                }
            } else {
                System.out.println();
                System.out.println("⚠️ Невідома дія. Хід пропущено.");
            }

            if (bossHp <= 0) {
                break;
            }

            System.out.println();
            System.out.println("🤖 Хід Боса:");
            if (bossStunned) {
                System.out.println("Бос оглушений і пропускає хід!");
                bossStunned = false;
            } else {
                if (Math.random() < 0.15) {
                    System.out.println("💨 " + brawlerName + " ухиляється кувирком! Промах!");
                } else {
                    int incoming = bossDamage;
                    if (bossWeakened) {
                        incoming = incoming / 2;
                        bossWeakened = false;
                    }
                    playerHp -= incoming;
                    if (playerHp < 0) playerHp = 0;
                    System.out.println("Робо-Бос завдає удару! " + brawlerName + " отримує " + incoming + " шкоди!");
                }
            }
        }

        System.out.println("======================================================");
        if (bossHp <= 0) {
            System.out.println("🏆 ПЕРЕМОГА! РОБО-БОСА ЗНИЩЕНО!");
            System.out.println("Раундів зіграно: " + round);
            System.out.println("Зібрано Power Cubes: " + powerCubes + " шт.");
            System.out.println("Нагорода: +10 Трофеїв 🏆, 100 Starr Drops! Ви - Зірковий Гравець!");
        } else {
            System.out.println("💀 ПОРАЗКА... Сейф зруйновано.");
            System.out.println("Раундів зіграно: " + round);
            System.out.println("Зібрано Power Cubes: " + powerCubes + " шт.");
            System.out.println("Спробуйте взяти витривалішого бійця — Ель Прімо!");
        }
        System.out.println("======================================================");

        scanner.close();
    }

    private static String superBar(int charge) {
        int bars = charge / 10;
        if (bars > 10) bars = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i < bars ? "█" : "░");
        }
        return sb.toString();
    }

    private static String superTitle(String brawler) {
        if (brawler.equals("Шеллі")) return "СУПЕР-ДРІБ";
        if (brawler.equals("Кольт")) return "КУЛЬОВА БУРЯ";
        return "МЕТЕОРНИЙ СТРИБОК";
    }
}

// Я НЕ МОЖУ ВИГРАТИ БОСА(((