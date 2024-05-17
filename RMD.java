
class Base
{
    public int A, B;    
    public void Fun()
    {   System.out.println("Inside Base Fun");    }
    public void Gun()
    {   System.out.println("Inside Base Gun");    }
    public void Sun()
    {   System.out.println("Inside Base Sun");    }
    public void Run()
    {   System.out.println("Inside Base Run");    }
}

class Derived extends Base      //In C++ class Derived : public Base
{
    public int X, Y;
    public void Gun()
    {   System.out.println("Inside Derived Gun");    }
    public void Run()
    {   System.out.println("Inside Derived Run");    }
    public void Mun()
    {   System.out.println("Inside Derived Mun");    }
}

class RMD
{
    public static void main(String Arg[])
    {
       Base bobj = new Derived();
       bobj.Fun();      //  Base Fun
       bobj.Gun();      //  Derived Gun
       bobj.Sun();      //  Base Sun
       bobj.Run();      //  Derived Run
       //bobj.Mun();      //  error
    }
}