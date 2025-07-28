package myName.LinkedList.CircularLinkedList;

class NewCircircularDoublyLinkedNode{
    int data;
    NewCircircularDoublyLinkedNode prev;
    NewCircircularDoublyLinkedNode next;
    NewCircircularDoublyLinkedNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class CreationAndTraversalOfCircularDoublyLinkedList {

    public static void print(NewCircircularDoublyLinkedNode head){
        if(head == null){
            return;
        }
        NewCircircularDoublyLinkedNode curr = head;
        do{
            System.out.println(curr.data);
            curr = curr.next;
        }while(curr!=head);
    }
    public static void main(String[] args) {
        NewCircircularDoublyLinkedNode head = new NewCircircularDoublyLinkedNode(67);
        NewCircircularDoublyLinkedNode temp = new NewCircircularDoublyLinkedNode(52);
        NewCircircularDoublyLinkedNode temp2 = new NewCircircularDoublyLinkedNode(98);
        head.next = temp;
        temp.prev = head;
        temp.next = temp2;
        temp2.prev = temp;
        temp2.next = head;
        head.prev = temp2;
        print(head);
    }
}
