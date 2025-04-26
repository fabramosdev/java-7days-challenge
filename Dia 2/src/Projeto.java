import java.sql.Array;
import java.util.Arrays;

public class Projeto {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] my_array2 = {
                "Java", "Python", "PHP",
                "C", "C Programming", "C++",
        };

        // Imprima na tela:
        // Colocar array original
        // Colocar array em ordem
        // Resolução:
        System.out.println("===========================================================");
        System.out.println("Array 1");
        System.out.println(Arrays.toString(my_array1));
        System.out.println("===========================================================");
        System.out.println("Array 1 em ordem");
        Arrays.sort(my_array1);
        System.out.println(Arrays.toString(my_array1));
        System.out.println("===========================================================");
        System.out.println("Array 2");
        System.out.println(Arrays.toString(my_array2));
        System.out.println("===========================================================");
        System.out.println("Array 2 em ordem");
        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array2));
        System.out.println("================== END ====================");
    }
}
