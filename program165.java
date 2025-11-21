//Write a program to display below pattern
//Input: row:3      col:4
//Output: 
/*
    $   $   $   $
    $   $   $   $
    $   $   $   $
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i<=iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print("$\t");
            }
            System.out.println();
        }
    }    
}

class program165
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);

        pobj = null;
        sobj = null;
        System.gc();
    }
}