public class FinancialForecasting {

    /**
     * Recursive method to calculate the future value.
     * 
     * @param presentValue The initial or current value.
     * @param growthRate   The growth rate per period (as a decimal).
     * @param periods      The number of periods into the future.
     * @return The predicted future value.
     */
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base Case: If there are no more periods, the future value is the present value.
        if (periods == 0) {
            return presentValue;
        }
        
        // Recursive Step: The future value for the current period is the next period's present value.
        // We multiply the present value by (1 + growthRate) and decrement the periods.
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial value
        double growthRate = 0.05;     // 5% growth rate per period
        int periods = 10;             // 10 periods (e.g., years)

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        
        System.out.printf("Present Value: %.2f\n", presentValue);
        System.out.printf("Growth Rate: %.2f%%\n", growthRate * 100);
        System.out.printf("Periods: %d\n", periods);
        System.out.printf("The predicted future value after %d periods is: %.2f\n", periods, futureValue);
    }
}
