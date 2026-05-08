// Write a program to accept a number and print all the factors of that number.
//I/p: 10
//O/p:  1   2   5

import java.util.*;

class Logic
{
    public void DisplayFactors(int iNo)
    {
        int i = 0, iCount = 0;

        for(i = 1; i<=(iNo/2); i++)
        {
           if(iNo % i == 0)
           {
                System.err.print(i+"\t");
           }
        }  
        
    }
}


class practice14
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayFactors(iValue1);

        sobj.close();
    }
}