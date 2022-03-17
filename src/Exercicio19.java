import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int n = scanner.nextInt();

        System.out.println(Const.ANSI_GREEN + "In binary is: " + Const.ANSI_RESET + Const.ANSI_PURPLE + Integer.toBinaryString(n) + Const.ANSI_RESET);


    }
}
