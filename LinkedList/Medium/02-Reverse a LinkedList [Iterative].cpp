class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr || head -> next == nullptr){
            return head;
        }

        ListNode* prevNode = nullptr;
        ListNode* currNode = head;
        ListNode* nextNode = head -> next;

        while(currNode){
            currNode -> next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

            if(nextNode){
                nextNode = nextNode -> next;
            }
        }

        return prevNode;
    }
};