package semester1.practice02;

public class Task4HeronGeometry {
    public static void main(String[] args){
        double a = 7.0;
        double b = 8.0;
        double c = 9.0;
        double perimeter = a + b + c;
        double p = perimeter / 2.0;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double r = s / p;
        double incircleArea = Math.PI * r * r;
        double R = (a * b * c) / (4.0 * s);
        double circumcircleArea = Math.PI * R * R;

        System.out.println("================ ГЕОМЕТРИЧНИЙ ЗВІТ ================");
        System.out.println("Сторони: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Периметр (P):\t\t\t\t" + perimeter);
        System.out.println("Напівпериметр (p):\t\t\t" + p);
        System.out.println("Площа трикутника (S):\t\t" + s + " кв. од.");
        System.out.println("Радіус вписаного кола (r):\t" + r);
        System.out.println("Площа вписаного круга:\t\t" + incircleArea + " кв. од.");
        System.out.println("Радіус описаного кола (R):\t" + R);
        System.out.println("Площа описаного круга:\t\t" + circumcircleArea + " кв. од.");
        System.out.println("==================================================");
    }
}
