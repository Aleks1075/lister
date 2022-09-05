public class Liste
{
    Node head = null;
    Node tail = null;


    Node insertFromHead(Node node)
    {

        if(isEmpty())
        {
        //er liste tom
        head = node;
        tail = node;
        return head;
        }


        //listen er ikke tom
        node.next = head;
        head.previous = node;
        head = node;
        return head;
    }


    boolean isEmpty()
    {
        return head == null && tail == null;
    }


      String printFromHead() {

        StringBuilder stringBuilder = new StringBuilder();

        Node n = head;

        while (n != null)
        {
            //System.out.println(n.data);
            stringBuilder.append(n.data + " ");

            n = n.next;
        }
        return stringBuilder.toString().trim();
        //trim fjerner mellemrum i starten og slutningen af en string
    }

    void printFromTail(Node n)
    {
        while (n != null)
        {
            System.out.println(n.data);
            n = n.previous;
        }
    }
}
