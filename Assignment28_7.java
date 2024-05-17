// Write a java program which accepts N numbers from user and store it in Array
// and display the largest number from that array

import java.util.Scanner;

class Assignment28_7
{
    public static void main(String Arg[])
    {
        try
        {
            
            Scanner sobj = new Scanner(System.in);
            int Arr_Size = 0;
            
            System.out.print("Enter no of elements you want to enter: ");
            Arr_Size = sobj.nextInt(); 

            int[] Arr = new int[Arr_Size];
            
            System.out.println("Enter elements for array: ");
            int j = 0;
            for(j = 0; j< Arr_Size; j++)
            {
                Arr[j] = sobj.nextInt();
            }
            
            // System.out.println("Entered elements of array are: ");
            // int i = 0;
            // for(i = 0; i< Arr_Size; i++)
            // {
            //     System.out.println(Arr[i]+" ");
            // }

            Demo dobj = new Demo();
            int iRet = 0;
            iRet =dobj.Maximun(Arr);

            System.out.println("The largest number from array is: "+iRet);
    
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {}
    }
}

class Demo
{
    public int Maximun(int[] Array)
    {
        int iMax = 0;
        int i = 0;
        for(i = 0; i< Array.length; i++)
        {
            if(Array[i] > iMax)
            {
                iMax = Array[i];
            }
        }
        
        return iMax;
    }
}

