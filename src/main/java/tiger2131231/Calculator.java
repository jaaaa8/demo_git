package tiger2131231;

public class Calculator {

    // Hàm tính toán hai số theo phép toán truyền vào
    public static double calculate(double a, double b, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Không thể chia cho 0!");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Phép toán không hợp lệ! Hãy nhập +, -, *, hoặc /");
        }

        return result;
    }

    // Hàm main để chạy thử
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        char operator = '/';

        double result = calculate(a, b, operator);
        System.out.println("Kết quả: " + result);
    }
}

