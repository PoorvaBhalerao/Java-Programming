//Accept string from user and do following
//Input:  Hello 
//Output: _ello

import java.util.Scanner;

class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        
        return new String(Arr);            
    }
}

class program254
{
    public static void main(String Args[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        sobj = strobj.Update(sobj);                         // sobj is written which is old string

        System.out.println("Updated string is: "+sobj);     // we dont want old string now so that is used to display updated string without creating new string
                                                            // not preferable
    }
}