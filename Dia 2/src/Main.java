import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        int[] valores = {10, 20, 15, 30, 50};
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        System.out.println(valores[0]);

        String[] carros = {"Ferrari", "BMW", "Audi", "BYD"};
        // Pegando todos os carros
        System.out.println(Arrays.toString(carros));
        // Pegando um valor único
        System.out.println(carros[1]);
        // Manipulando valores internos
        carros[2] = "VW";
        System.out.println(Arrays.toString(carros));
        System.out.println("================================");
        /*
        * Arrays Multidimensionais
        * /
        String[][] cars = {{"Jeep", "BMW"},{"Renegade", "X6"}};
        System.out.println(Arrays.deepToString(cars));
        System.out.println("**********************************");
        System.out.println(cars[0][0]);
        /*/
        // Constantes //
        //final double taxaJuros = 12.45;
        //System.out.printf("Taxa juros: %.2f%n", taxaJuros);

        // Conversão de tipos //
        //String valorProduto = "10";
        //int total = Integer.parseInt(valorProduto + 2);
        //System.out.println(total);

        // A classe Math
        // ROUND - Usa o meio como parametro
        // 0 até 4 => para baixo // 5 em diante => para cima
        //double value = Math.round(10.5);
        //System.out.println(value);
        // CEIL - sempre para cima
        //double value2 = Math.ceil(10.5);
        //System.out.println(value2);
        // FLOOR - sempre para baixo
        //double value3 = Math.floor(10.5);
        //System.out.println(value3);
        // RANDOM - numeros randomicos
        //double value4 = Math.random() * 100;
        //System.out.println(value4);
        //double value5 = Math.round(Math.random() * 100);
        //System.out.println(value5);
        // RANDOM sem Float
        int value = (int) /* <== Fazendo casting */ Math.round(Math.random() * 100);
        System.out.println(value);
    }
}