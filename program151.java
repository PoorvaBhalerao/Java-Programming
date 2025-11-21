// Prototype/Layout of Pattern Printing

class Pattern
{
    public void Display()
    {
        System.out.println("Inside Display");
        //Logic of Pattern Printing
    }    
}

class program151
{
    public static void main(String[] args) 
    {
        Pattern pobj = new Pattern();

        pobj.Display();

        pobj = null;
        System.gc();
    }
}