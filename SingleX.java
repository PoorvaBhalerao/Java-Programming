
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

class SingleX
{
    public static void main(String Arg[])
    {
        Base bobj1 = new Base();        //No casting
        Derived dobj1 = new Derived();  //No casting
        Base bobj2 = new Derived();     //Upcasting...Allowed
        Derived dobj2 = new Base();     //Downcasting..not Allowed
    }
}