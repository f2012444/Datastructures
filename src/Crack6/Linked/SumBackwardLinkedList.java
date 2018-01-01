package Crack6.Linked;

public class SumBackwardLinkedList {
    public static void main(String[] args) {
        node head1 = new node(7);
        head1.next = new node(1);
        head1.next.next = new node(6);
        node head2 = new node(5);
        head2.next = new node(9);
        head2.next.next = new node(2);
        //head2.next.next.next = new node(9);

        node res = getSum(head1, head2);
        node temp = res;
        while(temp!= null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static node getSum(node one, node two) {
        node head = new node(0);
        node temp = head;
        int carry = 0;
        while(one!=null && two!=null) {
            int val = one.val+two.val+carry;
            carry = val/10;
            val = val%10;
            temp.next = new node(val);
            one = one.next;
            two = two.next;
            temp = temp.next;
        }

        while(one!=null) {
            int val = one.val+carry;
            carry = val/10;
            val = val%10;
            temp.next = new node(val);
            one = one.next;
            temp = temp.next;
        }

        while(two!=null) {
            int val = two.val+carry;
            carry = val/10;
            val = val%10;
            temp.next = new node(val);
            two = two.next;
            temp = temp.next;
        }

        if(carry != 0) {
            temp.next = new node(carry);
            temp = temp.next;
        }

        return head.next;


    }
}


