public class Clients {
    private String firstName;
    int age;
    int balance;

    Clients() {
        balance = 10;
    }

    void newAccount() {
        System.out.println(firstName + " account has been created");
        System.out.println("The new balance is " + balance);
    }
}
