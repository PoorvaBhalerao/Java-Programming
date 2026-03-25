//problems on string
//regular for loop

import java.util.*;

class program856
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
        for(int i = Arr.length-1 ; i >= 0; i--)
        {
            System.out.println(Arr[i]);
        }  
    
        sobj.close();

    }
}
