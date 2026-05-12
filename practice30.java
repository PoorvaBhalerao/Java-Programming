// Accept n numbers and display addition of each digit of each number

import java.util.*;

class Logic
{
    int Arr[];
    int iSize;

    public Logic(int No)
    {
        this.iSize = No;
        this.Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.err.println("Enter Elements:");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        
        System.err.println("Entered Elements are:");

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public void DisplayAddition()
    {
        int iSum = 0, iDigit = 0;

        for(int i = 0; i<Arr.length; i++)
        {
            iSum = 0;
            while(Arr[i] != 0)
            {
                iDigit = Arr[i] % 10;
                iSum = iSum + iDigit;
                Arr[i] = Arr[i]/ 10;
            }
            System.out.print(iSum+"\t");
        }

    }
}


class practice30
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to enter: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.Accept();

        lobj.DisplayAddition();

        sobj.close();
    }
}