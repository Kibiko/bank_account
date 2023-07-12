import java.time.LocalDate;

public class BankAccount {

    //PROPERTIES

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;

    //CONSTRUCTOR

    public BankAccount(String first, String last, LocalDate dob, int account){
        this.firstName = first;
        this.lastName = last;
        this.dateOfBirth = dob;
        this.accountNumber = account;
        this.balance = 0;
    }

    //BEHAVIOUR

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String fName){
        this.firstName = fName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dob){
        this.dateOfBirth = dob;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int account){
        this.accountNumber = account;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }
}
