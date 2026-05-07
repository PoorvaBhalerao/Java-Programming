// Accept a character from user and convert case of that character and display

import java.util.*;

class Logic
{
    public char ToggleCase(char ch)
    {
        char ch1 = '\0';

        if((ch >= 'a') && (ch <='z'))
        {
            ch1 = (char)(ch - 32);
        }
        else if((ch >= 'A') && (ch <= 'Z'))
        {
            ch1 = (char)(ch + 32);
        }
        
        return ch1;
    }

}

class practice3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();

        char ch = lobj.ToggleCase(cValue);

        System.out.println("Result: "+ch);

        sobj.close();
    }
}