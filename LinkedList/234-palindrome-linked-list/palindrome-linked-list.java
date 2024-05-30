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
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        //to reach the middle of linked list using tortoise and hae algorithm

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
            //to reverse the second half of the linked list
        ListNode newHead=reverse(slow.next);

        ListNode first=head;
        ListNode second=newHead;

        //to compare the values of first half and second half

        while(second!=null){
            if(first.val!=second.val){
                // if the values are not same return false
               ListNode t2= reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;

        }

        ListNode t1=reverse(newHead);
        return true;
    }
}