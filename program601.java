// File Packer - 38

import java.io.*;
import java.util.*;

class program601
{
    public static void main(String A[]) throws Exception    // we can write in try-catch
    {
        String str = "A.txt 10";        

        String Arr[] = str.split(" ");
        
        System.out.println(Arr.length);

        for(int i = 0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}