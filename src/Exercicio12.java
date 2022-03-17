import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input a number: ");
        double n1 = scanner.nextDouble();
        System.out.print("input another number: ");
        double n2 = scanner.nextDouble();
        System.out.print("input one more number: ");
        double n3 = scanner.nextDouble();

        System.out.println((n1+n2+n3)/3);

    }
}
