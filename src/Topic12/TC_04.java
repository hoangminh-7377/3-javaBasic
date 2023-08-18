package Topic12;

import java.util.Scanner;

public class TC_04 {
    //validate string số bắt đầu bằng một trong ba số 7 8 9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sđt");
        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println(inputString);

        int number = inputString.charAt(0);
        if(number==7)
        {
            System.out.println("Nhập đúng định dạng");
        }
        else System.out.println("Nhập sai định dạng");
    }
}
