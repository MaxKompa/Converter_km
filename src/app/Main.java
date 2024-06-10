package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double miles = 8.0;
        double kms = 15.0;
        double km = convertMilesToKilometers(miles);
        double mile = convertKilometersToMiles(kms);

        System.out.println("Result is " + km + " kilometers and " + mile + " miles.");
    }

    public static double convertMilesToKilometers(double miles) {
        return miles * CONV_K;
    }

    public static double convertKilometersToMiles(double kms) {
        return kms / CONV_K;
    }
}
