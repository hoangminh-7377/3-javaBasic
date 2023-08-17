package Topic07;

public class array_TC06
{
    //tổng và trung bình cộng
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,87,6,4,9,12,-74,2,6,146,59,28};
        int total =0;
        float average =0;
        for (int i: numberArray)
        {
            total += i;
            average=total/numberArray.length;
        }
        System.out.println("tổng: " +total);
        System.out.println("trung bình cộng: "+average);
    }
}
