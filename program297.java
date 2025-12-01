//Collections....Vector

import java.util.*;

class program297
{
    public static void main(String A[])
    {
        Vector <String> vobj = new Vector <String>();

        vobj.add("c");                                                  //add(element)
        vobj.add("c++");
        vobj.add("java");
        vobj.add("python");
        vobj.add("c#");
        vobj.add("java");


        System.out.println(vobj);

        vobj.add(2, "LSP");                                             //add(Index, element)

        System.out.println(vobj);

        System.out.println("Current capacity is: "+vobj.capacity());    // current capacity

        System.out.println(vobj.contains("LSP"));                       //contains(element)....true
        System.out.println(vobj.contains("UNIX"));                      //contains(element)....false

        vobj.remove(6);                                                 // remove(Index)
        System.out.println(vobj);

        Iterator iobj = vobj.iterator();                                //First make Iterator class object i e iobj and called iterator() method for vobj

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        vobj.clear();
    }
    
}