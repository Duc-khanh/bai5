package HcN;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài");
        double height = scanner.nextDouble();
        lopHcn lopHCN = new lopHcn( width,height);
        System.out.println("Hình chữ nhật của bạn \n"+ lopHCN.display());
        System.out.println("Chu vi HCN : "+ lopHCN.getPerimeter());
        System.out.println("Diện tích hcn: "+ lopHCN.getArea());
    }

}
