/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count = count + 1;
            temp = temp.next;
        }

        if(count == n){
            return head.next;
        }

        count = count - n;

        temp = head;
        ListNode prev = null;

        int num = 0;

        while(num != count){
            num += 1;
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        temp = null;

        return head;

    }
}
