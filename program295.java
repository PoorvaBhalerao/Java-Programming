//Collections....Vector

import java.util.*;

class program295
{
    public static void main(String A[])
    {
        Vector <Integer> vobj = new Vector <Integer>();

        vobj.add(11);                    //add(element)
        vobj.add(21);
        vobj.add(51);
        vobj.add(101);
        vobj.add(111);

        System.out.println(vobj);

        vobj.add(2, 10);                //add(Index, element)

        System.out.println(vobj);

        System.out.println("Current capacity is: "+vobj.capacity());        // current capacity

        System.out.println(vobj.contains(101));             //contains(element)....true
        System.out.println(vobj.contains(31));             //contains(element)....false
    }
    
}