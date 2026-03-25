//Accept String from user and display such word which length is maximum and display length of longest word also

import java.util.*;

class program858
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iMax = 0;
        String Maxword = null;

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
                Maxword = Arr[i];
            }
        }  

        System.out.println("Largest word is: "+Maxword);
        System.out.println("Length of Longest word is: "+iMax);
    
        sobj.close();

    }
}
