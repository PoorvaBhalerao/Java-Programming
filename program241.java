//Accept string from user and calculate length and display it

import java.util.Scanner;

class program241
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");

        String str = sobj.nextLine();

        System.out.println("Input is: "+ str);
        System.out.println("Length of string is: "+str.length());       // length() is method of string

    }
}