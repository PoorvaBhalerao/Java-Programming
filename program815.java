//Write a program to check whether a given number is a Strong Number or not
//Strong number is if sum of factorials of each digit is equal to number itself.

import java.util.*;

class program815
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iFact = 0, i = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();

        iFact = 1;
        for(i = 1; i<= iNo; i++)
        {
            iFact = iFact * i;
        }
        System.out.println("Factorial is : "+iFact);

        sobj.close();
    }
}