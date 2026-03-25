//Accept String from user and and reverse each word from string and display it. -- 2
//Hello demo abcd
//olleH omed dcba


import java.util.*;

class program865
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");

        String str = sobj.nextLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();                       // it reverses whole string
        System.out.println(sb);



        
        sobj.close();

    }
}
