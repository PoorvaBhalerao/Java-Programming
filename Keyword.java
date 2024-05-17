class Base
{
    public int A, B;
    public Base()       //default constructor
    {
        System.out.println("Inside Base Constructor");
        this.A = 10;
        this.B = 20;
    }
    public void fun()
    {
        System.out.println("Inside fun of Base");
    }
}

class Derived extends Base
{
    public int X, Y;
    public Derived(int i , int j)       //parameterised constructor
    {
        super();        //parent class
        System.out.println("Inside Derived Constructor");
        this.X = i;
        this.Y = j;
    }
    public void gun()
    {
        System.out.println("Inside gun of Derived");
        super.fun();
        System.out.println("Value of A: "+super.A);
        System.out.println("Value of X: "+this.X);
    }
}

class Keyword
{
    public static void main(String args[])
    {
        Derived dobj = new Derived(11,21);
        dobj.gun();
    }
}