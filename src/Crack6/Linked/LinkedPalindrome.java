package Crack6.Linked;

public class LinkedPalindrome {
    public static void main(String[] args) {
        node head = new node(12);
        head.next = new node(21);
        head.next.next = new node(12);
//        head.next.next.next = new node(31);
//        head.next.next.next.next = new node(12);
//        head.next.next.next.next.next = new node(23);

//        node temp = reverse(getMiddle(head).next);
//
//        while(temp!=null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(node head) {
        node temp = head;
        node middle = getMiddle(head);
        middle.next = reverse(middle.next);
        node temp2 = middle.next;

        while(temp2 != null) {
            if(temp.val != temp2.val) {
                return false;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        return true;

    }

    static node getMiddle(node head) {
        if(head == null) {
            return head;
        }
        if(head.next == null || head.next.next == null) {
            return head;
        }
        node slow = head;
        node fast = head;
        //node temp = head;
        while(true) {
            if(fast.next == null || fast.next.next == null) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

    }

    static node reverse(node head) {
        if(head == null || head.next == null) {
            return head;
        }
        node prev = null;
        node temp = head;
        node next = head;
        while(temp.next != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        temp.next = prev;

        return temp;


    }

}
