// Accept N numbers from user and display all such numbers which contains 3 digits in it

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

    public void DisplaythreeDigitNum()
    {
        int iCount = 0;

        for(int i = 0; i<Arr.length; i++)
        {
            iCount = 0;
            int Num = Arr[i];
            while(Num != 0)
            {
                iCount++;
                Num = Num / 10;
            }

            if(iCount == 3)
            {
                System.out.print(Arr[i]+"\t");
            }
        }

    }
}


class practice29
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to enter: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.Accept();

        lobj.DisplaythreeDigitNum();

        sobj.close();
    }
}