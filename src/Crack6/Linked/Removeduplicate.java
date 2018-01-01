package Crack6.Linked;

public class Removeduplicate {

    public static void main(String[] args) {

        //SortLinkedList.sort()
        node head = new node(23);
        head.next = new node(12);
        head.next.next = new node(16);
        head.next.next.next = new node(31);
        head.next.next.next.next = new node(12);
        head.next.next.next.next.next = new node(31);
        removedup(head);



    }
    public static node removedup(node head) {

        head = SortLinkedList.sort(head);
        node temp = head;

        while(temp!=null) {
            node prev = temp;
            while(temp.next != null && temp.val == temp.next.val) {
                temp = temp.next;
            }
            prev.next = temp.next;
            //prev = temp;
            temp = temp.next;
        }
        temp = head;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

        return head;
    }
}
