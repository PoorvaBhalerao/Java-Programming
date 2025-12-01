//Accept string from user and display it

import java.util.Scanner;

class program240
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String str = sobj.nextLine();

        System.out.println("Hello "+ str);

    }
}