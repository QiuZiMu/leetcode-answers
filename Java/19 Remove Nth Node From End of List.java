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
        ListNode p=new ListNode(0,head);
        int i=0;
        ListNode q=head;
        int j=0;
        while(q.next!=null){
            j++;
            q=q.next;
            while(j-i>=n){
                i++;
                p=p.next;
            } 
        }
        p.next=p.next.next;
        if(i==0) head=p.next;
        return head;
    }
}