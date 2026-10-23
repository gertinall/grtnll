package semester1.practice02;

public class Task3TriangleClassifier {
    public static void main(String []args) {
        double a = 3.0; double b = 4.0; double c = 5.0;

        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
        boolean equilateral = (a == b) && (b == c);
        boolean isosceles = (a == b) || (a == c) || (b == c);

        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;
        boolean rightAngled = (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);

        System.out.println("Сторони трикутника: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("--------------------------------------------------");
        System.out.println("Чи існує такий трикутник:\t\t" + exists);
        System.out.println("Чи є рівностороннім:\t\t\t" + equilateral);
        System.out.println("Чи є рівнобедреним:\t\t\t\t" + isosceles);
        System.out.println("Чи є прямокутним:\t\t\t\t" + rightAngled);
    }
}

