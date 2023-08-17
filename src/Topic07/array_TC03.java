package Topic07;

public class array_TC03
{
    //hiển thị số chắn trong mảng
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,87,6,4,9,12,74,2,6,146,59,28};
        for (int i: numberArray)
        {
            if (i%2==0)
                System.out.println(i);
        }
    }
}
