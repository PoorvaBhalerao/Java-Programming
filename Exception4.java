import java.util.Scanner;

class Exception4
{
    public static void main(String Arg[])
    {
        try
        {
            // Code
        }
        // catch(Exception obj)     we cant write here it should be write at the end
        // {                        because all the exceptions are catch here
        // }                        because if any exception is not written then it is generic catch block.
        catch(ArrayIndexOutOfBoundsException obj)
        {
        }
        catch(ArithmeticException obj)
        {
        }
        catch(Exception obj)
        {
        }
        finally
        {
            System.out.println("inside finally block");
        }

    }
}