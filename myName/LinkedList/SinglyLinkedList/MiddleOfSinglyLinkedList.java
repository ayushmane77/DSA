package myName.LinkedList.SinglyLinkedList;

class elementNode{
    int data;
    elementNode next;
    elementNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class MiddleOfSinglyLinkedList {

    // public static int MiddleElement(elementNode head){
    //     if(head==null){
    //         return -1;
    //     }
    //     int length = 0;
    //     elementNode curr = head;
    //     while(curr!=null){
    //         length++;
    //         curr = curr.next;
    //     }
    //     int length2 = (length/2) + 1;
    //     elementNode curr2 = head;
    //     int length3 = 1;
    //     while(curr2!=null){
    //         if(length3==length2){
    //             return curr2.data;
    //         }
    //         curr2 = curr2.next;
    //         length3++;
    //     }
    //     return 0;
    // }


    public static int MiddleElement(elementNode head){
        if(head==null){
            return -1;
        }
        elementNode slow = head;
        elementNode fast = head;
        // while(slow!=null){
        //     if(fast==null || fast.next==null){
        //         return slow.data;
        //     }
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // return 1;

        //or
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        elementNode head = new elementNode(3);
        elementNode temp = new elementNode(2);
        elementNode temp2 = new elementNode(5);
        elementNode temp3 = new elementNode(4);
        elementNode temp4 = new elementNode(9);
        head.next = temp;
        temp.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        int ans = MiddleElement(head);
        System.out.println(ans);
    }
}
