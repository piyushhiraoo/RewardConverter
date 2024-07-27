public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Conversion rates
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private static final double CASH_TO_MILES_RATE = 1 / MILES_TO_CASH_RATE;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CASH_TO_MILES_RATE;
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Getters
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    // Override toString() for better output readability
    @Override
    public String toString() {
        return "RewardValue{" +
                "cashValue=" + cashValue +
                ", milesValue=" + milesValue +
                '}';
    }
}
