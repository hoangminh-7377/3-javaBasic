package Topic07;

import java.util.Scanner;

public class TC_05 {
    /*nhập n, hiển thị giai thừa của n*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n");
        int n = scanner.nextInt();
        scanner.close();
        int giaithưa=1;
        //khởi tạo i=n -> duyệt vòng lặp bắt đầu từ số n chú không phải từ số 0

        for(int i=1;i<=n;i++)
        {
            giaithưa *=i;
        }
        System.out.println("giai thừa: " +giaithưa);
    }
}
