//Accept String from user and display length of each word from string

import java.util.*;

class program857
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

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
            System.out.println(Arr[i]+ " : "+Arr[i].length());
        }  
    
        sobj.close();

    }
}
