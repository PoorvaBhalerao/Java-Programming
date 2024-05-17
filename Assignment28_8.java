// Write a program which accpets N numbers from user and store it into Array and
// Display avarage of all the numbers from array.

import java.util.Scanner;

class Assignment28_8
{
    public static void main(String args[]) 
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
            int Arr_Size = 0;

            System.out.println("Enter number of elements you want: ");
            Arr_Size = sobj.nextInt();

            int[] Arr = new int[Arr_Size];

            System.out.println("Enter Elements: ");
            int i = 0;
            for(i = 0; i< Arr_Size; i++)
            {
                Arr[i] = sobj.nextInt();
            }
            // System.out.println("Entered elements of array are: ");
            // int i = 0;
            // for(i = 0; i< Arr_Size; i++)
            // {
            //     System.out.println(Arr[i]+" ");
            // }
            
            
            Demo dobj = new Demo();
            int iRet = 0; 
          
            iRet = dobj.Average(Arr);

            System.out.println("Avarage of all the elements of array is: "+iRet);

        }
        catch(ArrayIndexOutOfBoundsException obj)
        {}
    }
}

class Demo
{
    public int Average(int[] Array)
    {
        int iAvg = 0;
        int iSum = 0;
        int i = 0;
                
        for(i=0; i < Array.length; i++);
        {
            iSum = iSum + Array[i];
        }
        
        System.out.println(iSum);

        iAvg = (iSum / Array.length);
        //System.out.println("The largest number from array is: "+iAvg);
        
        return iAvg;
    }
}
