class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* middle = head;

        while (head && head -> next) {
            head = head -> next -> next;
            middle = middle -> next;
        }

        return middle;
    }
};