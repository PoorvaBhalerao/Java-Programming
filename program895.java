// Study Tracker 1

import java.time.LocalDate;

//done
class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate a,String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }

    @Override
    public String toString()
    {
        return Date+"   |   "+Subject+"   |   "+Duration+"   |   "+Description;
    }

}

class program895
{
    public static void main(String[] args)
    {
        LocalDate lobj = LocalDate.now();

        StudyLog sobj = new StudyLog(lobj,"C programming",4.2 ,"Advanced pointer and array");

        System.out.println(sobj);                 // it will call to toString method

    }
}