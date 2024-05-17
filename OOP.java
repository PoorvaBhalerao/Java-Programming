class OOP
{
    public static void main (String Arg[])
    {
        Arithmatic obj1 = new Arithmatic();
        Arithmatic obj2 = new Arithmatic(21,11);

        //Arithmatic obj3;...it is not object in java it is just reference which may be used in future to create object
        //obj3 = new Arithmatic(10, 20);
        int Ret = 0;

        Ret = obj2.Addition();
        System.out.println(Ret);        //32

        Ret = obj2.Substraction();
        System.out.println(Ret);        //10
    }
}

class Arithmatic
{
    public int No1;
    public int No2;

    public Arithmatic()
    {
        System.out.println("Insidde Default constructor");
        this.No1 = 0;
        this.No2 = 0;
    }
    public Arithmatic(int A, int B)
    {
        System.out.println("Inside parameterised constructor");
        this.No1 = A;
        this.No2 = B;
    }
    public int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = No1 - No2;
        return Ans;
    }
}