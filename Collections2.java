//ArrayList

import java.util.*;

class Collections2
{
    public static void main(String args[]) 
    {
        ArrayList <String> aobj = new ArrayList<String>();
        
        aobj.add("PPA");
        aobj.add("LB");
        aobj.add("Python");
        aobj.add("PPA++");
        aobj.add("LB++");

        for(String str : aobj)      //for each loop
        {
            System.out.println(str);
        }
    }
}