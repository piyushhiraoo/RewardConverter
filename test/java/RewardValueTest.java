import org.junit.Test;
import static org.junit.Assert.*;

public class RewardValueTest {

    @Test
    public void testCashToMilesConversion() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.0001);
    }

    @Test
    public void testMilesToCashConversion() {
        double milesValue = 28571.4286;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.0001);
    }

    @Test
    public void testGetCashValue() {
        double cashValue = 50;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.0001);
    }

    @Test
    public void testGetMilesValue() {
        double milesValue = 14285.7143;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.0001);
    }
}
