//Write a program to check whether a given number is a Harshad(niven) Number or not
//Harshad number is number divisible by sum of its digits


import java.util.*;

class program828
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iDigit = 0, iSum = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();
        
        int iTemp = iNo;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        
        if(iTemp % iSum == 0)
        {
            System.out.println(iNo+ " is a Harshad Number");
        }
        else
        {
             System.out.println(iNo+ " is not a Harshad Number");

        }
        sobj.close();
    }
}