package Topic03;

import java.util.Scanner;

public class TC_01 {
    //khởi tạo scanner để cho nhập vào từ bàn phím
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input number");
        int n = scanner.nextInt();
        scanner.close();
        if (n%2==0)
        {
            System.out.println("số chẵn");
        }
        else System.out.println("số lẻ");
    }
}
