import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner tabuada = new Scanner(System.in);
        System.out.print("Input a number:");
        int n = tabuada.nextInt();

        for(int i = 1; i <= 10; i++){
            int res = n * i;
            System.out.println(n + "x" + i + "=" + res);
        }

    }
}
