
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

class Derived extends Base      //In C++ class Derived : public Base
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

class Single
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
        dobj.Fun();
        dobj.Gun();
    }
}