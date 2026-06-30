public class Forecast {

    static double predict(double amount, double rate, int years) {

        if(years == 0)
            return amount;

        return predict(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double result = predict(10000, 0.10, 5);

        System.out.println(result);
    }
}