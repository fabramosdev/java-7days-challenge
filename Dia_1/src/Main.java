import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Tipos primitivos
         * == Para números inteiros ==
         * byte      => [-128 ~ 127]
         * short     => [-32.000 ~ 32.000]
         * int       => [-2 Bilhões, 2 Bilhões]
         * long
         * == Para números fracionados ==
         * float
         * double
         * == Para caracteres ==
         * char
         * == Verdadeiro ou falso ==
         * boolean
         * */

        //byte minhaIdade = 47;
        //int salarioMensal = 10_000;
        //long idadeEmMilisegundos = 788400000000L;
        //char sexo = 'M';
        //boolean masculino = true;
        //double height = 1.78;
        //System.out.println(minhaIdade);
        //System.out.println(salarioMensal);

        /*
        *  Tipos de Referencia
        *
        *   Possuem métodos
        *
        *   Ex.: String
        *
        * */

        /*
         String firstName = "Fabiano " + "Ramos";
         System.out.println(firstName.toUpperCase());
        */

        /*
         *  RESUMO: Os tipos primitivos NÃO POSSUEM acesso aos métodos
         *          os tipos de referência POSSUEM acesso aos métodos
         */


        /*
        *   INPUT
        * */

        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        byte idadeCliente = idadeScanner.nextByte();
        System.out.println(idadeCliente);

    }
}