// File unpacker - 1

import java.io.*;
import java.util.*;

class program607
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        //Variable creation
       Scanner sobj = null;
       String FileName = null;

       sobj = new Scanner(System.in);

       System.out.println("Enter the name of Packed file: ");
       FileName = sobj.nextLine();

       File fpackobj = new File(FileName);

       if( ! fpackobj.exists())
       {
            System.out.println("There is no such packed file");
            return;
       }
      


    }
}