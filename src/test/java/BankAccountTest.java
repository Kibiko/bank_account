import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankaccount;

    @BeforeEach
    public void setUp(){
        bankaccount = new BankAccount("Kevin","Chan", LocalDate.of(1992, 12, 23),1258348,"current");
    }

    @Test
    public void canGetFirstName(){
        String result = bankaccount.getFirstName();
        String expected = "Kevin";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
        bankaccount.setFirstName("Lawrence");
        String expected = "Lawrence";
        assertThat(bankaccount.getFirstName()).isEqualTo(expected);
    }

    @Test
    public void canGetLastName(){
        String result = bankaccount.getLastName();
        String expected = "Chan";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        bankaccount.setLastName("Wong");
        String expected = "Wong";
        assertThat(bankaccount.getLastName()).isEqualTo(expected);
    }

    @Test
    public void canGetDateOfBirth(){
        LocalDate result = bankaccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1992,12,23);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        bankaccount.setDateOfBirth(LocalDate.of(1985,1,1));
        LocalDate expected = LocalDate.of(1985,1,1);
        assertThat(bankaccount.getDateOfBirth()).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber(){
        int result = bankaccount.getAccountNumber();
        int expected = 1258348;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber(){
        bankaccount.setAccountNumber(312854);
        int expected = 312854;
        assertThat(bankaccount.getAccountNumber()).isEqualTo(expected);
    }

    @Test
    public void canGetBalance(){
        float result = bankaccount.getBalance();
        float expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        bankaccount.setBalance(250);
        float expected = 250f;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

    @Test
    public void canDeposit(){
        bankaccount.deposit(1000.50f);
        float expected = 1000.50f;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

    @Test
    public void canWithdraw(){
        bankaccount.withdraw(1000.50f);
        float expected = -1000.50f;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

    @Test
    public void canGetAccountType(){
        String result = bankaccount.getAccountType();
        String expected = "current";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void setAccountType(){
        bankaccount.setAccountType("savings");
        String expected = "savings";
        assertThat(bankaccount.getAccountType()).isEqualTo(expected);
    }

    @Test
    public void canPayInterestSavings(){
        bankaccount.setBalance(1000);
        bankaccount.setAccountType("savings");
        bankaccount.payInterest();
        float expected = 1050;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

    @Test
    public void canPayInterestCurrent(){
        bankaccount.setBalance(1000);
        bankaccount.setAccountType("current");
        bankaccount.payInterest();
        float expected = 1020;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

    @Test
    public void canNotGoBelowOverDraft(){
        bankaccount.setBalance(-1950);
        bankaccount.withdraw(200);
        float expected = -1950;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

}
