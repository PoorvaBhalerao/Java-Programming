
class Base
{
    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
    public final void gun()
    {
        System.out.println("Inside Base Gun");
    }
}

class Derived extends Base
{
    public void fun()       // mothod override
    {
        System.out.println("Inside Derived Fun");
    }
    public void gun()       //method override//error
    {
        System.out.println("Inside Derived Gun");
    }
}


class final2
{
    public static void main(String Arg[])
    {
        
    }
}