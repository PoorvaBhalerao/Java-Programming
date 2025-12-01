//Accept string from user and do following operations

import java.util.Scanner;

class program247
{
    public static void main(String Args[])
    {
        int iCnt = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sobj = scanobj.nextLine();

        char Arr[] = sobj.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        

    }
}