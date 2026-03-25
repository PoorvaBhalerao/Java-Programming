//Accept String from user and and reverse each word from string and display it. -- 6 (Final code)
//Hello demo abcd
//olleH omed dcba

import java.util.*;

class program869
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");

        String str = sobj.nextLine();
        
        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Arr[] =str.split(" ");

        StringBuffer sb = null;

        StringBuffer finalstr = new StringBuffer();

        for(int i = 0; i < Arr.length; i++)
        {
            sb = new StringBuffer(Arr[i]);                      // string to stringBuffer
            (finalstr.append(sb.reverse())).append(" ");
        }  

        String ret = new String(finalstr);                      // StringBuffer to string
        ret = ret.trim();
        
        System.out.println(ret);
        System.out.println(ret.length());
       
        sobj.close();

    }
}
