class Solution {
public:
    ListNode* findMiddle(ListNode* head){
        ListNode* slow = head;
        ListNode* fast = head;

        while(fast && fast -> next){
            slow = slow -> next;
            fast = fast -> next -> next;
        }

        return slow;
    }
    ListNode* reverseList(ListNode* head){
        ListNode *prevNode = nullptr;
        ListNode *currNode = head;
        ListNode *nextNode = head -> next;

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
    bool isPalindrome(ListNode* head) {
        ListNode* midNode = findMiddle(head);

        midNode = reverseList(midNode);

        while(midNode){
            if(head -> val != midNode -> val){
                return false;
            }

            head = head -> next;
            midNode = midNode -> next;
        }

        return true;
    }
};