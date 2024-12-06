import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void ShouldToBuy(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;


        assertEquals(actual, expected);
    }
    @Test
    public void ShouldToBuyMin(){
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;


        assertEquals(actual, expected);
    }

}