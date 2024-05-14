package lopHT;

import java.util.Scanner;

public class lopHinhTron {
    private double radius;

    public lopHinhTron(double radius) {
        this.radius = radius;
    }

    public lopHinhTron() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap : ");
        this.radius = scanner.nextDouble();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
