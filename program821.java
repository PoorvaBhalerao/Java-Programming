//Write a program to check whether a given number is a Armstrong Number or not
//Armstrong number is if sum of each digit raised to power of total digits is equal to number itself.
//153
//1^3 + 5^3 + 3^3 = 153
//1234
//1^4 + 2^4 + 3^4 + 4^4 = something => not Armstrong

import java.util.*;

class program821
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int x = 0,y = 0, i = 0, ipow = 0;

        System.out.println("Enter Base Number: ");
        x = sobj. nextInt();

        System.out.println("Enter Power: ");
        y = sobj.nextInt();

        // x = 5, y = 3
        ipow = 1;
        for(i = 1; i <= y; i++)
        {
            ipow = ipow * x;
        }
        
        System.out.println(ipow);
        sobj.close();
    }
}