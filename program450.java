//Doubly Linear Linked List.. final code
//InsertFirst, Display, Count, InsertLast, DeleteFirst, DeleteLast, InsertAtPos, DeleteAtPos

class node
{
    public int data;
    public node next;               // Reference
    public node prev;

    public node(int no)             // Important
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL
{
    private node first;              //Reference
    private int iCount;

    public DoublyLL()
    {
        System.out.println("Object of DoublyLL gets created");
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = null;
        newn = new node(no);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first.prev = newn;
            this.first = newn;
        }
        
        this.iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = null;
        node temp = null;

        newn = new node(no);

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
            newn.prev = temp;
        }
        this.iCount++;
    }

    public void DeleteFirst()
    {
        if(this.first == null)
        {
            System.out.println("LL is empty");
            return;
        }
        else if(this.first.next == null)
        {
            this.first = null;
        }
        else
        {
            this.first = this.first.next;
            this.first.prev = null;
        }
        System.gc();

        this.iCount--;
    }

    public void DeleteLast()
    {
        node temp = null;

        if(this.first == null)
        {
            System.out.println("LL is empty");
            return;
        }
        else if(this.first.next == null)
        {
            this.first = null;
        }
        else 
        {
            temp = this.first;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        System.gc();
        this.iCount--;
    }

    public void Display()
    {
        node temp = null;
        temp = this.first;

        System.out.print("null <=> ");
        while(temp != null) 
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertAtPos(int no, int pos)
    {
        int iCnt = 0;
        node temp = null;
        node newn = null;

        if((pos < 1) || (pos > this.iCount+1))
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            this.InsertFirst(no);
        }
        else if(pos == this.iCount+1)
        {
            this.InsertLast(no);
        }
        else 
        {
            newn = new node(no);
            temp = this.first;

            for(iCnt = 1; iCnt < pos-1; iCnt++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;
            temp.next = newn;
            newn.prev = temp;

            this.iCount++;
        }       
    }

    public void DeleteAtPos(int pos)
    {
        int iCnt = 0;
        node temp = null;

        if((pos < 1) || (pos > this.iCount))
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            this.DeleteFirst();
        }
        else if(pos == this.iCount)
        {
            this.DeleteLast();
        }
        else 
        {
           
            temp = this.first;

            for(iCnt = 1; iCnt < pos-1; iCnt++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
            
            this.iCount--;
            System.gc();
        }
    }
}

class program450
{
    public static void main(String Args[])
    {
        int iRet = 0;
        DoublyLL obj = null;
        obj = new DoublyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteFirst();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteLast();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.InsertAtPos(455, 4);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteAtPos(4);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);



        obj = null;                             // Important for memory deallocation
        System.gc();
    }
}