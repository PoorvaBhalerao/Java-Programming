//Accept two String from user and check whether that strings are Anagram or not.    ****** 1
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

class program871
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int Count[] = new int[26];

        for(int i = 0; i<Arr.length; i++)
        {
            System.out.println((int)Arr[i]);            // it gives ASCII values              
        }

        
        sobj.close();

    }
}
