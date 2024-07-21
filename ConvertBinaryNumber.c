/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    int result = 0;

    // Traverse the linked list
    while (head != NULL) {
        result = (result << 1) | head->val;
        head = head->next;
    }

    return result;
}
