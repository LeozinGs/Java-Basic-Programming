import java.util.Scanner;

public class Exercicio17_18 {
    public static void main(String[] args) {

//      Para o exercicio 18 mudar a soma para multiplicação.

        Scanner scanner = new Scanner(System.in);
        System.out.print("input a binary number:");
        String i0 = scanner.next();
        System.out.print("input a second binary number:");
        String i1 = scanner.next();

        int n0 = Integer.parseInt(i0, 2);
        int n1 = Integer.parseInt(i1, 2);

        int sum = n0 + n1;

        System.out.println(Const.ANSI_GREEN + "Binary: " + Const.ANSI_RESET + Const.ANSI_PURPLE + i0 + " + " + i1 + " = " + Integer.toBinaryString(sum) + Const.ANSI_RESET);
        System.out.println(Const.ANSI_GREEN + "Decimal: " + Const.ANSI_RESET + Const.ANSI_CYAN + n0 + " + " + n1 + " = " + sum + Const.ANSI_RESET);
    }
}
