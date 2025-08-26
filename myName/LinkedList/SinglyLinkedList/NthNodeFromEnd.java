package myName.LinkedList.SinglyLinkedList;

class aNode{
    int data;
    aNode next;
    aNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class NthNodeFromEnd {

    // public static int nthnodeFromEnd(aNode head,int k){
    //     if(head==null || k<=0){
    //         return -1;
    //     }
    //     int length = 0;
    //     aNode curr = head;
    //     while(curr!=null){
    //         length++;
    //         curr = curr.next;
    //     }
    //     if(k>length){
    //         return -1;
    //     }
    //     int j = length - k;
    //     int count = 0;
    //     aNode curr2 = head;
    //     while(curr2!=null){
    //         if(count==j){
    //             return curr2.data;
    //         }
    //         count++;
    //         curr2 = curr2.next;
    //     }
    //     return -1;
    // }


    public static int nthnodeFromEnd(aNode head,int k){
        if(k<=0 || head == null){
            return -1;
        }
        aNode curr = head;
        for(int i=0;i<k;i++){
            if(curr==null){
                return -1;
            }
            curr = curr.next;
        }
        aNode fast = curr;
        aNode slow = head;
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }
    
    public static void main(String[] args) {
        aNode head = new aNode(32);
        aNode temp = new aNode(15);
        aNode temp2 = new aNode(74);
        head.next = temp;
        temp.next = temp2;
        int ans = nthnodeFromEnd(head,1);
        System.out.println(ans);
    }
}
