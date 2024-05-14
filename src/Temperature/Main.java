package Temperature;

public class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25);

        System.out.println("nhiet do F: " + temp.getFahrenheit());
        System.out.println("nhiet do kenvin: " + temp.getKelvin());
    }
}

