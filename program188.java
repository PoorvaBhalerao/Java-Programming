//Write a program to display below pattern. 
/*
Input:   iRow:4      iCol:4
Output:
    
    $   $   $   $
    $   $   *   $
    $   *   $   $
    $   $   $   $
        
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;  
        
        if(iRow != iCol)        
        {
            System.out.println("Invalid Input");
            System.out.println("Number of Rows and Number of Columns should be same");
            return;
        }

        for(i = 1; i<=iRow; i++)
        {
            for(j = 1 ; j<=iCol; j++)
            {
                if((i == j) || (i == iRow) || (i == 1) || (j == iCol) || (j == 1))
                {
                    System.out.print("$\t");
                }          
                else 
                {
                    System.out.print("*\t");
                }                  
            }

            System.out.println();
        }
    }
}

class program188
{
    public static void main(String A[]) 
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}