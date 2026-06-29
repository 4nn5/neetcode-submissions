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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode ansHead = ans;
        int carry = 0;
        int sumAns = 0;

        while(l1 != null && l2 != null){
            sumAns = l1.val + l2.val + carry;

            if(sumAns > 9){
                carry = 1;
                sumAns = sumAns % 10; 
            } 
            
            else {
                carry = 0;
            }
            ListNode next = new ListNode(sumAns);
            ans.next = next;

            l1 = l1.next;
            l2 = l2.next;
            ans = ans.next;
        }

        if(l1 != null){
            while(l1 != null){
                sumAns = l1.val + carry;

                if(sumAns > 9){
                    carry = 1;
                    sumAns = sumAns % 10; 
                } 
                else {
                    carry = 0;
                }

                ListNode next = new ListNode(sumAns);
                ans.next = next;

                l1 = l1.next;
                ans = ans.next;
            }
        }

        else if(l2 != null){
            while(l2 != null){
                sumAns = l2.val + carry;

                if(sumAns > 9){
                    carry = 1;
                    sumAns = sumAns % 10; 
                } 
                else {
                    carry = 0;
                }

                ListNode next = new ListNode(sumAns);
                ans.next = next;

                l2 = l2.next;
                ans = ans.next;
            }
        }

        if (carry > 0) {
            ans.next = new ListNode(carry);
        }

        return ansHead.next;
    }
}
