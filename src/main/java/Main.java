import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj parametr X:");
        double first = sc.nextDouble();
        System.out.println("Podaj parametr Y:");
        double second = sc.nextDouble();

        Point p = new Point(first, second);

        System.out.println(PointCalculator.getQuarter(p));

    }
}
