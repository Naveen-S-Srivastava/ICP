class Solution {
    public void reorderList(ListNode head) {
        if(head==null && head.next==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode h1=head;
        ListNode h2=prev; 
        while(h2!=null){
            ListNode p1=h1.next;
            ListNode p2=h2.next;
            h1.next=h2;
            h2.next=p1;
            h1=p1;
            h2=p2;
        }
    }
}