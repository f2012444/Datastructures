package Crack6.Linked;

public class ReverseLinkedList {
    static node reverseLinkedList(node head) {
        node temp = head;
        node prev = null;
        node next = head;
        while(temp.next!=null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        temp.next = prev;
        return temp;

    }
}
