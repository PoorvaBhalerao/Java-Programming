class Marvellous
{
    public int i, j;

    public Marvellous()
    {
        System.out.println("Marvellous Constructor");
    }

    protected void finalize()       //In program, finalize method call doesnt go because object deallocated by automatic garbage collector
    {
        System.out.println("Inside finalize method");
    }
}
// class ObjectDemo1 extends Object
class ObjectDemo1
{
    public static void main(String Arg[]) 
    {
        //Object obj = new Marvellous();          //upcasting...base class refers to derived class
        Marvellous obj = new Marvellous();
        System.out.println(obj.hashCode());
        obj = null;
        System.gc();    //garbage collector...its a request call to garbage collector 
    }//after calling garbage collector it may go to finalize method
}