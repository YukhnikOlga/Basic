import ru.netology.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldRemainIfAmountLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainIfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainIf1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainIfAmount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainIfAmountMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainIfAmount0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}
