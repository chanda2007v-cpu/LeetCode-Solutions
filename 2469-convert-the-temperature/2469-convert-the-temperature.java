class Solution {
    public double[] convertTemperature(double celsius) {
        double K= celsius + 273.15;
        double F= celsius * 1.80 + 32.00;
        return new double[]{K,F};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna