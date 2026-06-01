class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

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
}