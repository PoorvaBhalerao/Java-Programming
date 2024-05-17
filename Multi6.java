class Demo extends Thread
{
    public void run()
    {
        try
        {
            int i = 0;
            String name = Thread.currentThread().getName();
            for(i = 0; i <= 10 ; i++)
            {
                System.out.println("Running Thread:  "+name+" with value: "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception obj)
        {}
    }
}

class Multi6
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Current thread is: "+Thread.currentThread().getName()); //main
        Demo obj1 = new Demo();
        obj1.setName("PPA");
        obj1.start();      
        
        obj1.join();
        
        System.out.println("End of main thread");
    }
}

//threads are scheduled randomly
// main thread executed first and starting its child threads it will terminated before child threads completed its exucution
// so to hold main thread till end use method obj1.join() child thread.join()