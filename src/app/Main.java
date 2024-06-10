package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double miles = 5.0;
        double km = convertMilesToKilometers(miles);

        System.out.println("Result is " + km + " kilometers.");
    }

    public static double convertMilesToKilometers(double miles) {
        return miles * CONV_K;
    }
}
