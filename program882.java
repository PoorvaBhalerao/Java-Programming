//Accept two String from user and check whether that strings are Anagram or not.    ****** 5 final code 2
//Anagram means if we consider two words then letters from first word are exactly there in second word without maintaining sequence
//number of letters and number of occurence of letters is same
//i/p: info
//o/p: fion =>strings are Anagram 

/*
    0   1   2   3   4   5   6   7   8   9   ...
    a   b   c   d   e   f   g   h   i   j   ...
    97  98  99  100 101 102 103 104 105 106 ... =>ASCII values
*/

import java.util.*;

class program882
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter String: ");
        String str1 = sobj.nextLine();

        System.out.println("Enter String: ");
        String str2 = sobj.nextLine();

        if(str1.length() != str2.length())                      // Filter
        {
            System.out.println("Strings are not Anagram");
            return;
        }

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        Arrays.sort(Arr);                   // important
        Arrays.sort(Brr);                   // important

        str1 = new String(Arr);             // character array to string
        str2 = new String(Brr);

        if(str1.equals(str2))
        {
            System.out.println("Strings are Anagram");
        }
        else
        {
            System.out.println("Strings are not Anagram");
        }



        
        sobj.close();

    }
}
