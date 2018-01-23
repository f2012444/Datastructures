package Linkedin;

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


public class MergeKsortedLists {
    ListNode mergeKLists(ListNode[] lists) {
        ListNode res = merge(lists, 0, lists.length -1);
        return res;
    }

    ListNode merge(ListNode[] lists, int start, int end) {
        if(start == end) {
            return lists[start];
        }

        int mid = (start+end)/2;
        ListNode one = merge(lists, start, mid);
        ListNode two = merge(lists, mid+1, end);

        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(one!=null && two!= null) {
            int val1  = one.val;
            int val2 = two.val;
            if(val1 < val2) {
                temp.next = new ListNode(val1);
                temp = temp.next;
                one = one.next;
            } else {
                temp.next = new ListNode(val2);
                temp = temp.next;
                two = two.next;
            }
        }

        while(one!=null) {
            temp.next = new ListNode(one.val);
            temp = temp.next;
            one = one.next;
        }

        while(two!=null) {
            temp.next = new ListNode(two.val);
            temp = temp.next;
            two = two.next;
        }

        return res.next;
    }
}
