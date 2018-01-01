package Crack6.Linked;

public class LoopLinkedList {
    public static void main(String[] args) {
        node head = new node(23);
        head.next = new node(12);
        head.next.next = new node(16);
        head.next.next.next = new node(31);
        head.next.next.next.next = new node(12);
        head.next.next.next.next = head.next;
        System.out.println(findLoop(head));
    }
    static boolean findLoop(node head) {
        if(head == null || head.next == null ) {
            return false;
        }

        node slow = head.next;
        node fast = head.next.next;
        while(fast !=null && fast.next != null) {
            if(slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;

    }
}
