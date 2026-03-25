
//Using collection


import java.util.*;

class program873
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

        hobj.put('h',1);
        hobj.put('e',1);
        hobj.put('l',1);
        hobj.put('l',2);
        hobj.put('o',1);

        System.out.println(hobj);
        
        
        sobj.close();

    }
}
