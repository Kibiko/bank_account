import java.time.LocalDate;

public class BankAccount {

    //PROPERTIES

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private float balance;
    private String accountType;
    private float overdraft;

    //CONSTRUCTOR

    public BankAccount(String first, String last, LocalDate dob, int accountNum, String accountType){
        this.firstName = first;
        this.lastName = last;
        this.dateOfBirth = dob;
        this.accountNumber = accountNum;
        this.accountType = accountType;
        this.balance = 0f;
        this.overdraft = -2000f;
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

    public float getBalance(){
        return this.balance;
    }

    public void setBalance(float newBalance){
        this.balance = newBalance;
    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public void withdraw(float amount){
        if ((this.balance - amount) >= overdraft){
            this.balance -= amount;
        } else{
            System.out.println("Can not go below overdraft. Please top up your balance.");
        }
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public void payInterest() {
        if (this.accountType.equals("savings")) {
            this.balance *= 1.05;
        } else if (this.accountType.equals("current")){
            this.balance *= 1.02;
        }
    }
}
