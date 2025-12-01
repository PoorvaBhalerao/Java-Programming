//Accept string from user and count capital characters from string(A to Z)

import java.util.Scanner;

class StringX
{
    public int CountCapital(String str)
    {
        int iCnt = 0, iCount = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program251
{
    public static void main(String Args[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountCapital(sobj);

        System.out.println("Count of small characters is: "+iRet);
        
    }
}