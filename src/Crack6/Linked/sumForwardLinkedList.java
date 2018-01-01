package Crack6.Linked;

public class sumForwardLinkedList {
    public static void main(String[] args) {
        node head1 = new node(7);
        head1.next = new node(1);
        head1.next.next = new node(6);
        node head2 = new node(5);
        head2.next = new node(9);
        head2.next.next = new node(2);
        head1 = ReverseLinkedList.reverseLinkedList(head1);
        head2 = ReverseLinkedList.reverseLinkedList(head2);
        node sum = SumBackwardLinkedList.getSum(head1, head2);
        sum = ReverseLinkedList.reverseLinkedList(sum);
        node temp  = sum;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }



}
