package tiger2131231;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();

        System.out.print("Nhập phép toán (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();

        double result = Calculator.calculate(a, b, operator);
        System.out.println("Kết quả = " + result);

        sc.close();
    }
}
