package Crack6.Linked;

public class IntersectLinkedList {
    public static void main(String[] args) {
        node head = new node(23);
        head.next = new node(12);
        head.next.next = new node(16);
        head.next.next.next = new node(31);
        head.next.next.next.next = new node(12);
        head.next.next.next.next.next = new node(31);
        node head2 = new node(23);
        head2.next = new node(12);
        head2.next.next = head.next.next.next;
//        head2.next.next = new node(16);
//        head2.next.next.next = new node(31);
//        head2.next.next.next.next = new node(12);
//        head2.next.next.next.next.next = new node(31);

        System.out.println(findintersect(head, head2));

    }

    static boolean findintersect(node head1, node head2) {
        int length1 = getLinkedlistLength(head1);
        int length2 = getLinkedlistLength(head2);

        node temp1 = head1;
        node temp2 = head2;
        if(length1 > length2) {
            int count = length1 - length2;
            while(count > 0) {
                temp1 = temp1.next;
                count-=1;
            }
        } else if(length2 > length1) {
            int count = length2 - length1;
            while(count > 0) {
                temp2 = temp2.next;
                count-=1;
            }
        }

        while(temp1 != null) {
            if(temp1 == temp2){
                return true;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return false;

    }

    static int getLinkedlistLength(node head) {
        int count = 0;
        while(head!=null) {
            head = head.next;
            count+=1;
        }

        return count;
    }
}
