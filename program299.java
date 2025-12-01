//Collections..... LinkedList(it is doubly linkedlist)
//Ordered
//Indexed
//allowes duplicates
//mutable

import java.util.*;

class program299
{
    public static void main(String A[])
    {
        LinkedList <Double> vobj = new LinkedList <Double>();

        vobj.add(10.5);                                                  //add(element)
        vobj.add(30.7);
        vobj.add(12.6);
        vobj.add(78.9);
        vobj.add(90.7);

        System.out.println(vobj);

        vobj.addFirst(10.0);
        vobj.addLast(100.0);

        vobj.remove(2);

        System.out.println(vobj);

        Iterator iobj = vobj.iterator();                                //First make Iterator class object i e iobj and called iterator() method for vobj

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        vobj.clear();
    }
    
}