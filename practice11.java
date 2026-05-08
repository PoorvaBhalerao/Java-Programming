// Write a program to find even factorial of given number
//I/p: 5
//O/p: 8(4*2)

import java.util.*;

class Logic
{
    public void EvenFactorial(int iNo)
    {
        int i = 0;
        int iProd = 1;

        for(i = 1; i <= iNo; i++)
        {
            if(i % 2 == 0)
            {
                iProd = iProd * i;
            }
        }   
        
        System.out.println(iProd);
    }
}


class practice11
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.EvenFactorial(iValue);

        sobj.close();
    }
}