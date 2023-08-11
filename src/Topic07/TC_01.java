package Topic07;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class TC_01 {
    /*nhập n, hiển thị số chẵn từ n > 100*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n");
        int n = scanner.nextInt();
        scanner.close();
        //khởi tạo i=n -> duyệt vòng lặp bắt đầu từ số n chú không phải từ số 0
        for(int i=n;i<=100 && i%2==0;i++)
        {
            System.out.println(i);
            i++;
        }
    }
}
