package Topic07;

import java.util.Scanner;

public class TC_02 {
    public static void main(String[] args) {
        /*nhập a và b, hiển thị số chia hết cho 3 [a;b]*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        int a = scanner.nextInt();
        System.out.println("nhập b");
        int b = scanner.nextInt();
        scanner.close();

        for (int i=a;i<=b;i++)
        {
            //sử dụng if ở đây thì không cần i++ trong hàm thực hiện
            if (i%3==0 && i%5==0 && i<=50)
            {
                System.out.println("số chia hết cho 3 và 5: " + i);
            }
        }
    }
}
