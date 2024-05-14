package Temperature;

public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public double getKelvin() {
        return celsius + 273.15;
    }
}
