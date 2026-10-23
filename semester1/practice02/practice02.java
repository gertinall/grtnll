package semester1.practice02;

public class practice02 {
    public static void main(String[] args) {
        System.out.println("Очікуваний результат: ");
        int age = 16;
        double height = 1.62;
        char firstLetter = 'A';
        boolean isStudent = true;
        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);
        System.out.println();

        byte temperature = -18;
        short currentYear = 2026;
        int cityPopulation = 1201541;
        long worldPopulation = 8100000000L;
        System.out.println("" + temperature + "\n" + currentYear + "\n" + cityPopulation + "\n" + worldPopulation);
        System.out.println();

        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;
        System.out.println(floatValue + "\t" + doubleValue);
        System.out.println();

        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1 + "\t" + symbol2 + "\t" + symbol3);
        System.out.println();

        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyEmerald = true;
        System.out.println("\nIs Java fun? - " + isJavaFun + "\nIs fish fly? - " + isFishFly + "\nIs sky смарагдове? - " + isSkyEmerald);
        System.out.println();

        final double GRAVITY = 9.81;
        //final double GRAVITY = 10.0;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";
        System.out.println(GRAVITY + "\n" + DAYS_IN_WEEK + "\n" + UNIVERSITY_NAME);
        System.out.println();

        final int number1 = 5;
        final double userWeight = 67.67;
        final String userCity = "Kyiv";
        boolean isValidUser = true;
        System.out.println("Number1: " + number1 + "\nUser weight: " + userWeight + "\nUser city: " + userCity + "\nIs valid User? - " + isValidUser);
        System.out.println();

        final String firstName = "Тарас";
        final String lastName = "Шевченко";
        int age1 = 47;
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + age1 + " років.");
        System.out.println();

        int a = 10;     int b = 20;
        System.out.println("Сума без дужок: " + a + b); //розпізнано як об'єднання змінної 'a' зі змінною 'b'
        System.out.println("Сума з дужками: " + (a + b)); //(a + b) розпізнано як вираз
        System.out.println();

        final String login = "ivan.petrenko";
        final String domain = "gmail.com";
        final String role = "student";
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + login + "@" + domain);
        System.out.println();

        final String productName = "Ноутбук";
        final int quantity = 2;
        final double pricePerUnit = 24500.50;
        System.out.println("ЧЕК: \nТовар: " + productName + "\nКількість: " + quantity + " шт. \nЦіна: " + pricePerUnit + " грн");
        System.out.println();

        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);

        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println(protocol + "" + host + "" + endpoint + "/" + userId);
        System.out.println();

        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + " | Рівень: " + level + " | Готовність до практики: " + isReady);
        System.out.println();

        int number = 19;
        int number2 = 2;
        int remainder = number % 2;
        System.out.println("Число " + number + " при діленні на " + number2 + " дає остачу: " + remainder);
        System.out.println();

        int totalSeconds = 385;
        int totalMinute = totalSeconds / 60;
        int remainderSeconds = totalSeconds % 60;
        System.out.println(totalSeconds + " секунд = " + totalMinute + " хв " + remainder + " сек ");
        System.out.println();

        int n = 47;
        int tens = n / 10;
        int ones = n % 10;
        System.out.println("Число: " + n + ". Десятки: " + tens + ", Одиниці: " + ones + ". Сума цифр: " + (tens + ones));
        System.out.println();

        System.out.println("Очікуваний результат: ");
        int score = 100;

        score += 50;
        System.out.println("Після додавання: " + score);

        score -= 20;
        System.out.println("Після віднімання: " + score);

        score *= 2;
        System.out.println("Після множення: " + score);

        score /= 4;
        System.out.println("Після ділення: " + score);

        System.out.println();

        int counter = 5;
        System.out.println(counter++);
        System.out.println(counter);
        //Постфіксний інкремент (x++) спочатку повертає поточне значення, а потім збільшує його
        System.out.println();

        int counter1 = 5;
        System.out.println(++counter1);
        //Префіксний інкремент (++x) спочатку збільшує значення, а потім повертає результат
        System.out.println();

        int grade1 = 4; int grade2 = 5; int grade3 = 4;
        double grades = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("Середній бал: " + grades);
        System.out.println();

        double celsius = 25.0;
        System.out.println(celsius + "°C = " + (celsius * 1.8 + 32) + "°F");
        System.out.println(celsius + "°C = " + (celsius + 273.15) + " K");
        System.out.println();

        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);
        System.out.println();

        int x = 15; int y = 20;
        boolean equals = x == y;
        boolean doesntEquals = x != y;
        boolean greater = x > y;
        System.out.println("x == y: " + equals + "\nx != y: " + doesntEquals + "\nx > y: " + greater);
        System.out.println();

        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);
        System.out.println("Чи знаходиться швидкість у безпечному міському діапазоні від 20 до 80 включно? - " + isSafeSpeed);
        System.out.println();

        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);
        System.out.println();

        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked + "\nЧи можна увійти: " + canEnter);
        System.out.println();

        int number6 = 30;
        boolean isDivisibleByBoth = (number6 % 3 == 0) && (number6 % 5 == 0);
        System.out.println("Результат для числа 30: " + isDivisibleByBoth);

        int number7 = 25;
        boolean isDivisibleByBoth1 = (number7 % 3 == 0) && (number7 % 5 == 0);
        System.out.println("Результат для числа 25: " + isDivisibleByBoth1);
        System.out.println();

        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println("- Користувач може може увійти? \n- " + canLogin);
        System.out.println();

        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("2024 рік був високосним: " + isLeapYear);
        System.out.println();

        double d = 3.0; double e = 4.0;
        double c = Math.sqrt(Math.pow(d, 2) + Math.pow(e, 2));
        System.out.println("Катети: " + d + " та "+ e + ". Гіпотенуза: " + c);
        System.out.println();

        double radius = 5.0;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius + "\nРадіус: " + radius + "\nПлоща круга: " + area);
        System.out.println();

        double dayTemp = 18.5;
        double nightTemp = -3.2;

        double tempDiff = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);

        System.out.println("Модуль різниці: " + tempDiff + " | Макс: " + maxTemp + " | Мін: " + minTemp);
        System.out.println();

        double num = 5.67;
        System.out.println("Для " + num + " -> round: " + Math.round(num) + ", ceil: " + Math.ceil(num) + ", floor: " + Math.floor(num));

        double negNum = -5.67;
        System.out.println("Для " + negNum + " -> round: " + Math.round(negNum) + ", ceil: " + Math.ceil(negNum) + ", floor: " + Math.floor(negNum));
        System.out.println();

        double a1 = 1.0; double b1 = -7.0; double c1 = 10.0;
        System.out.println("Дискримінант D = " + (Math.pow(b1, 2) - 4*a1*c1));
        System.out.println("Корінь х1 = "  + ((-b1 + Math.sqrt((Math.pow(b1, 2) - 4*a1*c1))) / 2*a1));
        System.out.println("Корінь х2 = "  + ((-b1 - Math.sqrt((Math.pow(b1, 2) - 4*a1*c1))) / 2*a1));
        System.out.println();

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);
        System.out.println();

        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Погода на завтра: " + randomTemp + "°C");
        System.out.println();

        double P = 10000.0;
        int t = 3;
        double r = 12.0;
        double S = P * Math.pow((1+(r/100)), t);
        double profit = S - P;
        System.out.println("+------------------------------------+\n" + "|     ДЕПОЗИТНИЙ КАЛЬКУЛЬАТОР        |\n" + "+------------------------------------+");
        System.out.println(("Початкова сума: " + P + " грн \nТермін: " + t + " роки під " + r + "% річних"));
        System.out.println("Підсумкова сума: " + (Math.round(S * 100.0) / 100.0) + " грн");
        System.out.println("Чистий прибуток: " + (Math.round(profit * 100.0) / 100.0) + " грн");
        System.out.println("+------------------------------------+");
        System.out.println();

    }
}

