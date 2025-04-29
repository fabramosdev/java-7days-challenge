import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int countDigits = Integer.toString(n).length();

        if (countDigits == 1) {
            System.out.println("O número possui 1 dígito.");
        } else if (countDigits > 1 && countDigits <= 4) {
            System.out.println("O número possui " + countDigits + " dígito(s).");
        } else if (countDigits >= 5) {
            System.out.println("O número possui 5 dígitos ou mais");
        }
    }
}
