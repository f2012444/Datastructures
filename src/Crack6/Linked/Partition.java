package Crack6.Linked;

public class Partition {
    public static void main(String[] args) {

        //SortLinkedList.sort()
        node head = new node(23);
        head.next = new node(12);
        head.next.next = new node(16);
        head.next.next.next = new node(31);
        head.next.next.next.next = new node(12);
        head.next.next.next.next.next = new node(31);
        node temp = split(head, 16);
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }



    }

    static node split(node head, int val) {
        node left = new node(0);
        node right = new node(0);
        node temp = head;
        node lefthead = left;
        node righthead = right;
        while(temp!=null) {
            if(temp.val < val) {
                left.next = temp;
                left = left.next;
                temp = temp.next;
            } else {
                right.next = temp;
                right = right.next;
                temp = temp.next;
            }
        }
        left.next = righthead.next;
        right.next = null;
        return lefthead.next;
    }
}
