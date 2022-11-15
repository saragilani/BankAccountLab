public class Runner {
    public static void main(String[] args) {


        BankAccount Sara = new BankAccount("Sara", "Ahmed", "1999-5-8", 1, 0, "Savings", 100);

        Sara.setFirstName("Sarah");

        System.out.println(Sara.getFirstName());
        System.out.println(Sara.getBalance());
        System.out.println(Sara.getDateOfBirth());

        Sara.setDateOfBirth("May 8th 1999");
        System.out.println(Sara.getDateOfBirth());
        Sara.deposit(1000);
        System.out.println(Sara.getBalance());
        Sara.withdrawal(250);
        System.out.println(Sara.getBalance());

        Sara.payInterest(Sara.getAccountType());
        System.out.println(Sara.getBalance());
    }
}
