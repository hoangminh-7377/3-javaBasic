package Topic12;

public class TC_01 {
    //Check whether a character is Uppercase or not in Java
    public static void main(String[] args)
    {
        String statement = "Check whether a character is Uppercase or not in JavB";
        String outputString="";
        //i < length vì index bắt đầu từ 0
        for (int i =0; i < statement.length();i++)
            if(Character.isUpperCase(statement.charAt(i))==true)
                outputString+=statement.charAt(i);
        System.out.println(outputString);
    }
}
