package semester1.practice06.homework;

public class Task1Fraction {

    static class Fraction {
        private int numerator;
        private int denominator;

        public void setValues(int num, int den) {
            if (den == 0) {
                System.out.println("Помилка: знаменник не може дорівнювати 0!");
                this.numerator = num;
                this.denominator = 1;
                return;
            }
            if (den < 0) {
                this.numerator = -num;
                this.denominator = -den;
                return;
            }
            this.numerator = num;
            this.denominator = den;
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        private int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public void simplify() {
            int divisor = gcd(numerator, denominator);
            if (divisor != 0) {
                numerator /= divisor;
                denominator /= divisor;
            }
        }

        public double toDecimal() {
            return (double) numerator / denominator;
        }

        public void add(int otherNum, int otherDen) {
            if (otherDen == 0) {
                System.out.println("Помилка: знаменник другого дробу не може дорівнювати 0!");
                return;
            }
            numerator = numerator * otherDen + otherNum * denominator;
            denominator = denominator * otherDen;
            simplify();
        }

        public void printFraction() {
            if (denominator == 1) {
                System.out.println(numerator);
            } else {
                System.out.println(numerator + "/" + denominator);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        Fraction fraction1 = new Fraction();
        fraction1.setValues(8, 12);
        System.out.print("Дріб 1: ");
        fraction1.printFraction();

        fraction1.simplify();
        System.out.print("Після скорочення: ");
        fraction1.printFraction();

        double decimal1 = Math.round(fraction1.toDecimal() * 10000.0) / 10000.0;
        System.out.println(" (десятковий вигляд: " + decimal1 + ")");

        System.out.println();
        System.out.println("Додаємо дріб 3/4 до " + fraction1.getNumerator() + "/" + fraction1.getDenominator() + "...");

        int a = fraction1.getNumerator();
        int b = fraction1.getDenominator();
        int c = 3;
        int d = 4;

        System.out.println("Формула: " + a + "/" + b + " + " + c + "/" + d
                + " = (" + a + "*" + d + " + " + c + "*" + b + ") / (" + b + "*" + d + ") = "
                + (a * d + c * b) + "/" + (b * d));

        fraction1.add(c, d);
        System.out.print("Результат додавання: ");
        fraction1.printFraction();

        double decimal2 = Math.round(fraction1.toDecimal() * 10000.0) / 10000.0;
        System.out.println(" (десятковий вигляд: " + decimal2 + ")");
        System.out.println("=====================================");
    }
}
