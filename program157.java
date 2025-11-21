//Write a program to display below pattern
//Input: 6
//Output:   -6  -5  -4  -3  -2  -1  

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = -iNo; iCnt < 0; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
        System.out.println();
    }    
}

class program157
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a frequency: ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);

        pobj = null;
        sobj = null;
        System.gc();
    }
}