public class BankAccount {
    // Properties
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private String accountType;
    private int overdraft;

    // Constructor
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, int balance, String accountType, int overdraft) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.overdraft = overdraft;
    }

    // methods
    public int deposit(int depositAmount) {
        this.balance = balance + depositAmount;
        return balance;
    }

     public int withdrawal(int withdrawalAmount) {
        this.balance = balance - withdrawalAmount;
        return balance;
     }

     public int payInterest(String accountType) {
        if (accountType == "Savings"){
            this.balance = (int) (balance*0.9);
        } else if (accountType =="Current") {
            this.balance = (int) (balance*0.99);
        }
        return balance;
     }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getOverdraft() {
        return overdraft;
    }
    //Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }
}
