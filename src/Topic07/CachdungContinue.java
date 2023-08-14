package Topic07;

import java.util.Scanner;

public class CachdungContinue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập tên trình duyệt");
        String browserName = scanner.next();
        scanner.close();
        for(int i=0;i<1;i++)
        {
        if (browserName.equals("IE"))
        {
            continue;
        }
        else System.out.println();
        System.out.println("tên vừa nhập: " +browserName);
        }

    }
}
