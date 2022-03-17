import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("First Number:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Second Number:"));
        JOptionPane.showMessageDialog(null, "The product of these two numbers is:"+
                "\n"+n+"x"+n2+"="+(n*n2));
    }
}
