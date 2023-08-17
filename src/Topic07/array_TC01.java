package Topic07;

public class array_TC01 {
    //tìm số nguyên lớn nhất trong mảng
    public static void main(String[] args) {
        int[] numberArray = new int[] {2,7,6,8,9};
        //tạo biến trung gian có giá trị là phần tử đầu tiên của mảng
        int max = numberArray[0];
        for (int i: numberArray)
        {
            if (max<i)
                max=i;
        }
        System.out.println(max);
    }
}
