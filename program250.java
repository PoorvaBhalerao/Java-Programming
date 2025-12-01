//Accept string from user and count small characters from string(a to z)

import java.util.Scanner;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt = 0, iCount = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program250
{
    public static void main(String Args[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountSmall(sobj);

        System.out.println("Count of small characters is: "+iRet);
        
    }
}