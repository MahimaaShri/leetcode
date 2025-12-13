class Solution {
    public double[] convertTemperature(double celsius) {
        Double kel=celsius+273.15;
        Double fah=celsius*1.80+32.00;
        return new double[]{kel ,fah};
    }
}