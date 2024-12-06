import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void ShouldNeedToBuy(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1_900;

        int actual = service.remain(amount);
        int expected = 100;


        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotNeedToBuy(){
        CashbackHackService service = new CashbackHackService();
        int amount = 2_000;

        int actual = service.remain(amount);
        int expected = 0;


        assertEquals(expected, actual);
    }

}
