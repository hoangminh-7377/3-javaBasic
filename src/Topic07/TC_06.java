package Topic07;

import java.util.Scanner;

public class TC_06 {
    //in tổng của các số chẵn từ 1-10
    public static void main(String[] args) {
        System.out.println("nhập a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("nhập b");
        int b = scanner.nextInt();
        int tongsochan=0;

        for(int i = 1;i<=10 && i>=1 ;i++)
        {
            if(i%2==0)
                tongsochan +=i;
        }
        System.out.println(tongsochan);
    }
}
