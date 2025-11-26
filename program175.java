//Write a program to display below pattern.
/*
Input:   5
Output:
    a  b   c   d   e
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'a';

        for(iCnt = 1; iCnt <=iNo; iCnt++, ch++)
        {
            System.out.printf(ch+"\t");                  
        }     
        System.out.println();   
    }
}

class program175
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