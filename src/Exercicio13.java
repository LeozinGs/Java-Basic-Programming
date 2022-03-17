import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input a Width:");
        double w = scanner.nextDouble();
        System.out.print("input a Height:");
        double h = scanner.nextDouble();

        System.out.println("Area is :" + w + " x " + h + " = " + (w*h));
        System.out.println("Perimeter is :" + 2 + " x " + "(" + w + " + " + h + ")" + " = " + (2*(w+h)));
    }
}
