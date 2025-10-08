class Solution {
public boolean isPalindrome(ListNode head) {
    ListNode temp = head;
    ListNode slow = head;
    ListNode fast = head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode prev = null;
    ListNode curr =slow;
    while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    while(prev!=null){
        if(temp.val!=prev.val){
            return false;
        }
        temp=temp.next;
        prev=prev.next;
    }
    return true;
}