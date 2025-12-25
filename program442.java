// Singly Linear Linked List
//InsertFirst, Display, Count, InsertLast

class node
{
    public int data;
    public node next;               // Reference

    public node(int no)             // Important
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    public node first;              //Reference
    public int iCount;

    public SinglyLL()
    {
        System.out.println("Object of SinglyLL gets created");
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int no)
    {
        //node newn = null;
        //newn = new node();        OR
        node newn = new node(no);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }
        this.iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = null;
        newn = new node(no);        
        //node newn = new node(no);           // instead of writing newn.data = no and newn.next = null
        //above parameterised constructor is written for node class
        node temp = null;


        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;

        }
        this.iCount++;
    }

    public void InsertAtPos(int no, int pos)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DeleteAtPos(int pos)
    {}

    public void Display()
    {
        node temp = new node();
        temp = this.first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return this.iCount;
    }
}

class program442
{
    public static void main(String Args[])
    {
        int iRet = 0;
        SinglyLL obj = null;
        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj = null;                             // Important for memory deallocation
        System.gc();
    }
}