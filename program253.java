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

        //String temp = new String(Arr);    // object temp is of no use other than to return string so below line is directly written

        return new String(Arr);             // change
    }
}

class program253
{
    public static void main(String Args[])
    {
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        sRet = strobj.Update(sobj);

        System.out.println("Updated string is: "+sRet);
    }
}