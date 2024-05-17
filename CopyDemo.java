class Student implements Cloneable  // if we want to use clone() method then u have to implement Cloneable interface
{
    public String Name;
    public int Marks;
    public int Age;

    public Student(String str, int A, int B)
    {
        this.Name = str;
        this.Marks = A;
        this.Age = B;
    }
    public Object clone() throws CloneNotSupportedException     //public is access specifier, Object is return value, clone() is method
    {
        return super.clone();       //super.clone() means call to parent class i e Object class, parent class mdhli clone method gheun ye
    }


}

class CopyDemo
{
    public static void main(String Arg[])
    {
        try
        {
            Student sobj = new Student("Amit", 87, 25);
            System.out.println("Name of student: "+sobj.Name);
            System.out.println("Marks obtained by student: "+sobj.Marks);
            System.out.println("Age of student: "+sobj.Age);

            Student sobjX = (Student)sobj.clone();
            System.out.println("Name of student: "+sobjX.Name);
            System.out.println("Marks obtained by student: "+sobjX.Marks);
            System.out.println("Age of student: "+sobjX.Age);
        }
        catch(Exception obj)
        {}
    }
}