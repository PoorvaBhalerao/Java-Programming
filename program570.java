// File PackerUnpacker - 14
//write the data into file

import java.io.*;
import java.util.*;

class program570
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileOutputStream foobj = new FileOutputStream(fobj);
            String str = "Jay Ganesh...";

            byte Arr[] = str.getBytes();                    // it converts string to byte array

            System.out.println("Length of Arr is: "+Arr.length);

            foobj.write(Arr);
        }
        else
        {
            System.out.println("There is no such file");
        }
        
        sobj.close();
    }
}