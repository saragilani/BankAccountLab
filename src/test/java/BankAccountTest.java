import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount test;

    @BeforeEach
    public void setUp() {
        test = new BankAccount("Sara", "Ahmed", "1999-5-8", 1, 0, "Current", 100);
    }

    @Test
    public void testDeposit() {
        int actual = test.deposit(235);
        int expected = 235;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void testWithdrawal() {
        int actual = test.withdrawal(235);
        int expected = -235;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testPayInterest() {
        int actual = test.payInterest("Current");
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

}
