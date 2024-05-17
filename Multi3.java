class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        String name = Thread.currentThread().getName();
        for(i = 0; i <= 1000 ; i++)
        {
            System.out.println("Running Thread:  "+name+" with value: "+i);
        }
    }
}

class Multi3
{
    public static void main(String Arg[])
    {
        System.out.println("Current thread is: "+Thread.currentThread().getName()); //main
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.setName("PPA");
        obj2.setName("LB");

        obj1.start();       //when u call start method it will internally call run method
        obj2.start();       //start is not user defined method it is method of Thread class
    }
}

//threads are scheduled randomly