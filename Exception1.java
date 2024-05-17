import java.util.Scanner;

class Exception1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int No1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        int No2 = sobj.nextInt();

        float Ans = No1 / No2;

        System.out.println("Division is:    "+Ans);

    }
}

/*
if user has given input as No1 = some value e.g. 10 and No2 = 0
then exception occurs as infinity not / by 0
 */