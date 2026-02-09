//Write a program which converts a number from decimal to binary

import java.util.*;

class program619
{
    public static void main(String A[]) 
    {
        int no = 0;
        int iDigit = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        no = sobj.nextInt();

        while(no != 0)
        {
            iDigit = no % 2;
            System.out.print(iDigit);
            no = no/2;
            
        }
    }
}