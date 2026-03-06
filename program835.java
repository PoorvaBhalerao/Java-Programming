//Write a program to check whether a given number is Sunny Number or not
//Sunny Number is number if num + 1 is perfect square
//8 => 9 is a perfect square

import java.util.*;

class program835
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo =0;

        System.out.println("Enter NNumber: ");
        iNo = sobj.nextInt();

        iNo++;

        int Ans = (int)Math.sqrt(iNo);

        if(iNo == (Ans * Ans))
        {
            System.out.println((iNo-1)+" is a Sunny Number");
        }
        else
        {
            System.out.println((iNo-1) +" is not a Sunny Number");
        }
        
        sobj.close();
    }
}

