package Crack6.Linked;

import java.util.LinkedList;


public class SortLinkedList {
    public static void main(String[] args) {
        node head = new node(23);
        head.next = new node(12);
        head.next.next = new node(16);
        head.next.next.next = new node(31);
        head.next.next.next.next = new node(11);
        head.next.next.next.next.next = new node(19);
        node out = sort(head);
        node temp = out;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    public static node sort(node head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }

        node middle = getMiddle(head);
        node left = head;
        node right = null;
        if(middle != null) {
            right = middle.next;
            middle.next = null;
        }

        left = sort(left);
        right = sort(right);
        node sortedNew = getSorted(left, right);
        return sortedNew;

    }
    static node getSorted(node left, node right) {
        node head = new node(0);
        node temp = head;
        while(left!= null && right!= null) {
            if(left.val <= right.val) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        if(right != null) {
            while(right!=null) {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }

        }
        if(left != null) {
            while(left!=null) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
        }

        return head.next;
    }

    static node getMiddle(node head) {
        node prev = head;
        node slower = head;
        node faster = head;
        while(faster != null) {
            prev = slower;
            slower = slower.next;
            faster = faster.next;
            if(faster != null) {
                faster = faster.next;
            }
        }

        return prev;
    }
}
