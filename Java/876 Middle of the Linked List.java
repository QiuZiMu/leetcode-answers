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
    public ListNode middleNode(ListNode head) {
        int i=0;//存放mid位置
        int len=0;//存放链表长度
        ListNode mid=head; 
        while(head!=null){
            len++;
            while(i<len>>1){//遍历到现在长度下链表中间位置
                i++;
                mid=mid.next;
            }
            head=head.next;
        }
        return mid;
    }
}