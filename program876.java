// collections

import java.util.*;

class program876
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        //h   e   l   l   o

        HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

        int old = 0;

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                old = hobj.get(ch);             // we gets value using get(key)
                hobj.put(ch, old+1);

            }
            else
            {
                hobj.put(ch,1);

            }           

        }

        System.out.println(hobj);
        
        
        sobj.close();

    }
}
