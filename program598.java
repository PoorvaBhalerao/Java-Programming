// File Packer- 35

import java.io.*;
import java.util.*;

class program598
{
    public static void main(String A[]) throws Exception    // we can write in try-catch
    {
        String str = "     Marvellous    Pune     ";         // 5 white spaces first and last

        System.out.println("Data :"+str);
        System.out.println("Length: "+str.length());

        str = str.trim();               // trim() function removes last white spaces it does not removes middle white spaces between data

        System.out.println("Data :"+str);
        System.out.println("Length: "+str.length());      


    }
}