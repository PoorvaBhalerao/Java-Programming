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

}

class program438
{
    public static void main(String Args[])
    {
        SinglyLL obj = null;

        obj = new SinglyLL();

    }
}