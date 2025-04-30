public class ForLoops {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
        */
        /*
        String[] cars = {"Fiat", "Volvo", "BMW"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        */
        /*
        // Nested for loop
        for (String car : cars) System.out.println(car);
        */
        // Exemplo matriz nested for loop
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.println(i + "-" + x);
            }
        }
    }
}
