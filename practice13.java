// Write a program to accept a number and count number of factors.
//I/p: 10
//O/p: 3

import java.util.*;

class Logic
{
    public int CountFactors(int iNo)
    {
        int i = 0, iCount = 0;

        for(i = 1; i<=(iNo/2); i++)
        {
           if(iNo % i == 0)
           {
                iCount++;
           }
        }  
        
        return iCount;
        
    }
}


class practice13
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();

        System.out.println("Number of factors are: "+lobj.CountFactors(iValue1));

        sobj.close();
    }
}