package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter Application");
        System.out.println("Versoin 1.0.");
        System.out.println("This application converts temperatures between Fahrenheit and Celsius");

        double frt = 100;
        double cls = convFrtToCls(frt);
        System.out.println("Result is " + cls + " C ");
    }

    private static double convFrtToCls(double frt) {
        return (frt - 32) * 5 / 9;
    }
}
