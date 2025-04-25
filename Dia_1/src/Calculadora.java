import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int numeroUm = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.println("Ok, o número digitado foi " + numeroUm + ". Agora digite o segundo número: ");
        int numeroDois = n2.nextInt();
        int resultado = numeroUm + numeroDois;
        System.out.print("A soma (" + numeroUm + " + " + numeroDois + ") é: " + resultado);
    }
}
