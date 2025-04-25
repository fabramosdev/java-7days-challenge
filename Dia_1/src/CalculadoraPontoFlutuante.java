import java.util.Locale;
import java.util.Scanner;

public class CalculadoraPontoFlutuante {
    public static void main(String[] args) {
        Scanner pontoFlutuante01 = new Scanner(System.in).useLocale(Locale.ROOT);
        System.out.print("Digite o primeiro valor: ");
        double floatUm;
        floatUm = pontoFlutuante01.nextDouble();
        String strFloatUm = String.valueOf(floatUm);
        Scanner pontoFlutuante02 = new Scanner(System.in).useLocale(Locale.ROOT);
        System.out.println("Ok, o número digitado foi " + strFloatUm + ". Agora digite o segundo número: ");
        double floatDois;
        floatDois = pontoFlutuante02.nextDouble();
        String strFloatDois = String.valueOf(floatDois);
        double resultado = Math.round(floatUm + floatDois);
        String resultadoStr = String.valueOf(resultado);
        System.out.print("A soma (" + strFloatUm + " + " + strFloatDois + ") é: " + resultadoStr);
    }
}