package Crack6.Linked;

public class Klast {
    public static void main(String[] args) {
        node head = new node(23);
        head.next = new node(12);
        head.next.next = new node(16);
        head.next.next.next = new node(31);
        head.next.next.next.next = new node(12);
        head.next.next.next.next.next = new node(31);
        System.out.println(getklast(head, 7).val);
    }
    static node getklast(node head, int k) {
        node out = head;
        node temp = head;
        int count = 0;
        while(temp!=null) {
            temp = temp.next;
            count++;
            if(count > k) {
                out = out.next;
            }
        }

        if(count < k) {
            return null;
        } else {
            return out;
        }
    }
}
