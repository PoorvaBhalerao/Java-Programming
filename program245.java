//Accept string from user and do following operations

import java.util.Scanner;

class program245
{
    public static void main(String Args[])
    {
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sobj = scanobj.nextLine();

        char Arr[] = sobj.toCharArray();
        System.out.println(sobj.length());          // for string length() is a method
        System.out.println(Arr.length);             // for array length is property
    }
}