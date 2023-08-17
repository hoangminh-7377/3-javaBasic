package Topic07;

public class array_TC04
{
    //tổng số lẻ lớn hơn 0
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,-87,-6,4,9,12,-74,2,6,146,59,28};
        int total =0;
        for (int i: numberArray)
        {
            if (i%2!=0 && i>0) {
                System.out.println(i);
                total += i;
            }
        }
        System.out.println("tổng: " +total);
    }
}
