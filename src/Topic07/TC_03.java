package Topic07;

import java.util.Scanner;

public class TC_03 {
    public static void main(String[] args) {
        /*nhập n, hiển thị số lẻ từ 0 đến n*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        int a = scanner.nextInt();
        scanner.close();
        int total=0;

        for (int i=0;i<=a;i++)
        {
            //sử dụng if ở đây thì không cần i++ trong hàm thực hiện
            if (i%2!=0)
            {
                System.out.println("số lẻ: " + i);
                total+=i;
                //total = total +i --> khi int i = 3 thì total (0) = 0 + 3 --> khi int =5 thì total (3) = 3 +5...
            }
        }
        System.out.println("tổng: " +total);
    }
}
