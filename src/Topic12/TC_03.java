package Topic12;

import java.util.Scanner;

public class TC_03 {
    //đảo ngược chuỗi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String inputString = scanner.nextLine();
        scanner.close();

        String reversedString="";
        //char character;

        for (int i=inputString.length()-1; i>=0; i--)
        {
            reversedString += inputString.charAt(i);
        }
        System.out.println(inputString);
        System.out.println(reversedString);
    }
}
