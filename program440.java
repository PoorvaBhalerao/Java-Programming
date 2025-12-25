// Singly Linear Linked List

class node
{
    public int data;
    public node next;               // Reference
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
        node newn = new node();

        newn.data = no;
        newn.next = null;

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            
        }
    }

    public void InsertLast(int no)
    {}

    public void InsertAtPos(int no, int pos)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DeleteAtPos(int pos)
    {}

    public void Display()
    {}

    public int Count()
    {
        return this.iCount;
    }
}

class program440
{
    public static void main(String Args[])
    {
        int iRet = 0;
        SinglyLL obj = null;
        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(51);
        obj.InsertFirst(51);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);
    }
}