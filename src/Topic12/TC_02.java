package Topic12;

public class TC_02 {
    public static void main(String[] args) {
        String statement = "Automation Testing 345 Tutorials Online 789";
        int countA=0;

        for(int i=0; i<statement.length();i++)
        {
            //kiểu char thì dùng dấu nháy đơn
            //chuyển toàn bộ string sang ký tự thường, duyệt từng ký tự có bằng a không
            if (statement.toLowerCase().charAt(i)=='a')
                countA++;
        }
        System.out.println("Tổng số chữ a: "+countA);

        System.out.println("Chứa chữ Testing: "+statement.contains("Testing"));
        System.out.println("Bắt đầu bằng Automation: "+statement.startsWith("Automation"));


    }
}
