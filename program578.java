// File PackerUnpacker - 19
// Directory problems

import java.io.*;
import java.util.*;

class progam578
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        Scanner sobj = new Scanner(System.in);
        
        File fobj = new File("Marvellous");

        if(fobj.exists())
        {
            System.out.println("Folder is present");
        }
        else
        {
            System.out.println("There is no such Folder");
        }
    }
}