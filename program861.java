//Accept String from user and display such word which length is maximum and display length of longest word also **
//As string is non mutable so when we create strings in for loop then string pool may gets full so here we created index.

import java.util.*;

class program861
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iMax = 0;
        int Maxindex = 0;

        System.out.println("Enter String: ");

        //step 0:
        String str = sobj.nextLine();
        
        // step 1:
        str = str.trim();

        //step 2:
        str = str.replaceAll("\\s+"," ");

        //step 3:
        String Arr[] =str.split(" ");

        //step 4:
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                Maxindex= i;
            }
        }  

        System.out.println("Longest word is: "+Arr[Maxindex]);
        System.out.println("Length of Longest word is: "+iMax);
    
        sobj.close();

    }
}
