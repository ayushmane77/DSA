package myName.LinkedList.SinglyLinkedList;

class CreationOfNode{
    int data;
    CreationOfNode next;
    CreationOfNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class SortedInsertInSinglyLinkedList {

    public static CreationOfNode insertInSortedLinkedList(CreationOfNode head, int value){
        CreationOfNode newNode = new CreationOfNode(value);
        if(head==null){
            return newNode;
        }
        CreationOfNode curr = head;
        if(curr.data > newNode.data){
            newNode.next = head;
            return newNode;
        }
        boolean flag = false;
        while(curr.next!=null){
            if(curr.next.data>=newNode.data){
                newNode.next = curr.next;
                curr.next = newNode;
                flag = true;
                break;
            }
            curr = curr.next;
        }
        if(flag==false){
            curr.next = newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        CreationOfNode head = new CreationOfNode(27);
        CreationOfNode temp = new CreationOfNode(42);
        CreationOfNode temp2 = new CreationOfNode(57);
        head.next = temp;
        temp.next = temp2;
        CreationOfNode newLinkedList = insertInSortedLinkedList(head,50);
        CreationOfNode curr = newLinkedList;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
