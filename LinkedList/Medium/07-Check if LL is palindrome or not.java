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
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public ListNode reverseList(ListNode head){
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = head.next;

        while(currNode != null){
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }

        return prevNode;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode midNode = findMiddle(head);

        midNode = reverseList(midNode);

        while(midNode != null){
            if(head.val != midNode.val){
                return false;
            }

            head = head.next;
            midNode = midNode.next;
        }

        return true;
    }
}