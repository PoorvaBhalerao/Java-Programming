//Write a program to display below pattern
//Input: 6
//Output:   1   *   3   *   5   *   

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.print(iCnt+"\t");
            }
            else
            {
                System.out.print("*\t");
            }
        }
        System.out.println();
    }    
}

class program154
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