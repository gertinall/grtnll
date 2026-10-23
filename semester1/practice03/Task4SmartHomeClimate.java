package semester1.practice03;

import java.util.Scanner;

public class Task4SmartHomeClimate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Поточна температура (°C): ");
        double currentTemp = scanner.nextDouble();

        System.out.print("Бажана температура (°C): ");
        double desireTemp = scanner.nextDouble();

        System.out.print("Вологість повітря (%): ");
        int humidity = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Сезон (зима/літо/міжсезоння): ");
        String season = scanner.next();

        System.out.print("Режим будинку (1-Standby, 2-Eco, 3-Party, 4-Night, 5-Vacation): ");
        int mode = scanner.nextInt();

        System.out.print("Чи відчинені вікна? (true/false): ");
        boolean isWindowOpen = scanner.nextBoolean();

        System.out.println("\n------------- СТАТУС СИСТЕМИ -------------");

        if (isWindowOpen && (mode != 5)) {
            System.out.println("ПОПЕРЕДЖЕННЯ: Відчинені вікна! Обігрів та кондиціонування примусово заблоковано!");
            scanner.close();
            return;
        }

        String modeName;
        switch (mode) {
            case 1: modeName = "Standby (Звичайний)";
                break;
            case 2: modeName = "Eco (Енергозбереження)";
                break;
            case 3: modeName = "Party (Гості)";
                break;
            case 4: modeName = "Night (Ніч)";
                break;
            case 5: modeName = "Vacation (Відпустка)";
                break;
            default:
                System.out.println("Невідомий режим роботи.");
                scanner.close();
                return;
        }

        double effectiveTargetTemp = switch (mode) {
            case 1 -> desireTemp;
            case 2 -> {
                double delta;
                if (season.equalsIgnoreCase("зима")) {
                    delta = -2.0;
                } else if (season.equalsIgnoreCase("літо")) {
                    delta = 2.0;
                } else {
                    delta = 0.0;
                }
                yield desireTemp + delta;
            }
            case 3 -> desireTemp - 1.5;
            case 4 -> 19.0;
            case 5 -> {
                if (season.equalsIgnoreCase("зима")) {
                    yield 12.0;
                } else {
                    yield 28.0;
                }
            }
            default -> desireTemp;
        };

        double diff = effectiveTargetTemp - currentTemp;
        String thermostatStatus;
        if (diff < -1.0) {
            thermostatStatus = "Кондиціонер УВІМКНЕНО (Охолодження)";
        } else if (diff > 1.0) {
            thermostatStatus = "Опалення УВІМКНЕНО (Обігрів)";
        } else {
            thermostatStatus = "Температура в зоні комфорту (Кліматичні прилади в очікуванні)";
        }

        String humidityStatus = (humidity < 40)
                ? "Зволожувач УВІМКНЕНО (вологість " + humidity + "% < 40%)"
                : (humidity > 65)
                ? "Осушувач УВІМКНЕНО (вологість " + humidity + "% > 65%)"
                : "Вологість оптимальна (" + humidity + "%)";

        String powerStatus = (mode == 2 || mode == 5) ? "Оптимізоване" : "Стандартне";

        System.out.println("------------- СТАТУС СИСТЕМИ -------------");
        System.out.println("Режим роботи:              " + modeName);
        System.out.println("Цільова температура:       " + String.format("%.2f", effectiveTargetTemp)
                + "°C (скориговано з " + desireTemp + "°C для " + season + ")");
        System.out.println("Поточна температура:       " + String.format("%.2f", currentTemp) + "°C");
        System.out.println("Стан терморегуляції:       " + thermostatStatus);
        System.out.println("Стан мікроклімату:         " + humidityStatus);
        System.out.println("Енергоспоживання:          " + powerStatus);
        System.out.println("==========================================");

        scanner.close();
    }
}