
interface Circle
{
    public float Radius = 10.5f;    //all the members are by default public so it is not compulsary to write public
    public float PI = 3.14f;

    public float Area();
    public float Circumference();
}

class Marvellous implements Circle
{
    public float Area()
    {
        return PI * Radius * Radius;
    }
    public float Circumference()
    {
        return 2 * PI * Radius;
    }
}


class Blueprint
{
    public static void main(String Arg[])
    {
        Marvellous mobj = new Marvellous();

        System.out.println("Area is: "+mobj.Area());
        System.out.println("Circumference is: "+mobj.Circumference());

        System.out.println("value of Radius is: "+Circle.Radius);
        System.out.println("Value of Pi is:"+Circle.PI);

        //Circle.PI = 7.12;   //cannot assign value to staatic final variable


    }
}