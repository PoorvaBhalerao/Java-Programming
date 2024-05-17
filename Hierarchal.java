
class Base
{
    public int A, B;
    public Base()
    {
        System.out.println("Base Constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base
{
    public int X, Y;
    public Derived()
    {
        System.out.println("Derived Constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

class DerivedX extends Base
{
    public int P, Q;
    public DerivedX()
    {
        System.out.println("DerivedX Constructor");
    }
    public void Sun()
    {
        System.out.println("Inside DerivedX Sun");
    }
}

class Hierarchal
{
    public static void main(String Arg[])
    {
        Derived dobj1 = new Derived();
        DerivedX dobj2 = new DerivedX();
    }
}