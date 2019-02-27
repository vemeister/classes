package class1;


public class Basics {

    public static int getExpressionRet(int a, int b, int c, int d) throws ArithmeticException {
        if (d == 0) throw new ArithmeticException();

        return a * (b + (c / d));
    }

    public static boolean isWithinRange(int num1, int num2) {
        int total = num1 + num2;
        return (10 <= total && total <= 20);
    }

    static boolean isPositive(int num) {
        return (num >= 0);
    }

    public static void printPositive(int num) {
        System.out.println(isPositive(num));
    }

    static boolean isNegative(int num) {
        return (num < 0);
    }

    public static void printNegative(int num) {
        System.out.println(isNegative(num));
    }

    public static void printToConsole(String name) {
        System.out.println(String.format("Привет, %s!", name));
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static Moon getMoon() {
        return new Moon();
    }
}
