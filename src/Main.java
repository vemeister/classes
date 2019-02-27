import class1.Basics;
import class1.Moon;

public class Main {
    public static void main(String[] args) {
        // see tests for more examples.
        Moon moon = Basics.getMoon();
        System.out.println(moon.name);
        System.out.println(moon.orbitalPeriod);

        Basics.printToConsole("Mark");
        System.out.println(Basics.isLeapYear(2000));
    }
}
