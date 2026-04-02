//Collections -ArrayList
//Accept ArrayList and display name of highest marks of student and highest marks also

import java.util.*;

class Student
{
    private String name;
    private int marks;

    public Student(String a, int b)
    {
        this.name = a;
        this.marks = b;
    }

    public String getName()
    {
        return this.name;
    }

    public int getMarks()
    {
        return this.marks;
    }

    @Override
    public String toString()                
    {
        return this.name+" : "+this.marks;
    }
}

class program890
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iMax = 0;
        String Maxname = null;

        ArrayList<Student> aobj = new ArrayList<Student>();

        Student s1 = new Student("Sagar", 90);
        Student s2 = new Student("Rahul", 80);
        Student s3 = new Student("Pooja", 92);
        Student s4 = new Student("Amit", 72);

        aobj.add(s1);
        aobj.add(s2);
        aobj.add(s3);
        aobj.add(s4);

        for(Student s : aobj)
        {
            if(s.getMarks() > iMax)
            {
                iMax = s.getMarks();
                Maxname = s.getName();
            }
        }

        System.out.println("Name of Student who secure highest marks is: "+Maxname);
        System.out.println("Highest Marks received: "+iMax);

        aobj.clear();                               // it is used to remove all the elements from ArrayList    
              
        sobj.close();
    }
}