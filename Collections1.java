// LinkedList

import java.util.*;

class Collections1 
{
    public static void main(String args[]) 
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();  //....Integer wrapper class we have to create Linked list of Integer so written
        //LinkedList lobj = new LinkedList();...generally we create object like this

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);
        lobj.addFirst(5);
        System.out.println(lobj);

        Iterator iobj = lobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        lobj.clear();
    }
    
}