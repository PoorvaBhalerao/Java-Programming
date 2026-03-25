//problems on string
//tokenisation of string

import java.util.*;

class program852
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");

        String str = null;

        str = sobj.nextLine();

        str = str.trim();       // it removes strings pre and post extra white spaces

        str = str.replaceAll("\\s+"," ");          // it removes one or more white spaces.. regular expression

        String Arr[] = str.split(" ");              // all words are stored to array

        System.out.println("Number of words in string are: "+Arr.length);

    }
}
