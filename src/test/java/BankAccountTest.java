import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankaccount;

    @BeforeEach
    public void setUp(){
        bankaccount = new BankAccount("Kevin","Chan", LocalDate.of(1992, 12, 23),1258348);
    }

    @Test
    public void canGetFirstName(){
        String result = bankaccount.getFirstName();
        String expected = bankaccount.getFirstName();
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
        String expected = bankaccount.getLastName();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        bankaccount.setLastName("Chen");
        String expected = "Chen";
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
        int result = bankaccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        bankaccount.setBalance(250);
        int expected = 250;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

    @Test
    public void canDeposit(){
        bankaccount.deposit(1000);
        int expected = 1000;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }

    @Test
    public void canWithdraw(){
        bankaccount.withdraw(1000);
        int expected = -1000;
        assertThat(bankaccount.getBalance()).isEqualTo(expected);
    }


}
