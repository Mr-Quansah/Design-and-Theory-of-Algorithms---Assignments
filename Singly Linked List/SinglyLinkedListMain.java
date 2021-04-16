
public class SinglyLinkedListMain {
     public static void main(String args[])
    {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(2);
        
        Node node=new Node();
        node.data=1;
        myLinkedlist.deleteAfter(node);
       
        myLinkedlist.displayLinkedList();
    }
}

