//Write a program to display below pattern
//Input: 6
//Output:  1    *   2   *   3   *
//Input: 5
//Output:  1    *   2   *   3

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.println(((iCnt / 2) + 1)+"\t");
            }
        }
        System.out.println();
    }    
}

class program163
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