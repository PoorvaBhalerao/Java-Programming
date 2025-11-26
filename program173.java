//Write a program to display below pattern.
/*
Input:   5
Output:
        a  b   c   d   e
ASCII: 97   98  99  100 101 
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        int i = 97;

        for(iCnt = 1; iCnt <=iNo; iCnt++, i++)
        {

            System.out.printf("%d\t",i);        //97  98  99  100 101 
            
        }     
        System.out.println();   
    }
}

class program173
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the frequency: ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}