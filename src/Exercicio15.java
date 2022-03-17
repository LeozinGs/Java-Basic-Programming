import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input a variable (v1):");
        int v1 = scanner.nextInt();
        System.out.print("input a second variable (v2):");
        int v2 = scanner.nextInt();
        int aux;

        System.out.println(Const.ANSI_BLUE_BACKGROUND + Const.ANSI_BLACK + "BEFORE SWAP variable 1: "+ Const.ANSI_RESET + Const.ANSI_RESET + Const.ANSI_CYAN + v1 + Const.ANSI_RESET);
        System.out.println(Const.ANSI_BLACK_BACKGROUND + "BEFORE SWAP variable 2: " + Const.ANSI_RESET + Const.ANSI_CYAN + v2 + Const.ANSI_RESET);
        System.out.println(" ");

        aux = v1;
        v1 = v2;
        v2 = aux;

        System.out.println(Const.ANSI_BLUE_BACKGROUND + Const.ANSI_BLACK + "AFTER SWAP variable 1: "+ Const.ANSI_RESET + Const.ANSI_RESET + Const.ANSI_CYAN + v1 + Const.ANSI_RESET);
        System.out.println(Const.ANSI_BLACK_BACKGROUND + "AFTER SWAP variable 2: " + Const.ANSI_RESET + Const.ANSI_CYAN + v2 + Const.ANSI_RESET);
    }
}
