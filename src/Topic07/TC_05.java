package Topic07;

import java.util.Scanner;

public class TC_05 {
    /*nhập n, hiển thị giai thừa của n*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("giai thừa: " +tinhGiaithua(n));
    }
    public static long tinhGiaithua (int n)
    {
        int giaithua=1;
        //khởi tạo i=n -> duyệt vòng lặp bắt đầu từ số n chú không phải từ số 0
        if (n==0 || n==1)
        {
            return giaithua;
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                giaithua *=i;
            }
        }
        return giaithua;
    }
}
