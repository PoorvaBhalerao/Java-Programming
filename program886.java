//Collections -ArrayList

import java.util.*;

class Student
{
    public String name;
    public int marks;

    public Student(String a, int b)
    {
        this.name = a;
        this.marks = b;
    }

    public void Display()
    {
        System.out.println(this.name + " : "+this.marks);
    }

    @Override
    public String toString()                // this is inbuilt method of Object class
    {
        return "inside toString";
    }
}

class program886
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        ArrayList<Integer> aobj = new ArrayList<Integer>();

        Student s1 = new Student("Sagar", 90);
        Student s2 = new Student("Rahul", 80);
        Student s3 = new Student("Pooja", 92);
        Student s4 = new Student("Amit", 72);
        
        System.out.println(s1);                     // when we display object it will call to toString Method
        System.out.println(s2);                     // when we display object it will call to toString Method

        s1.Display();
        s2.Display();

        



        sobj.close();
    }
}