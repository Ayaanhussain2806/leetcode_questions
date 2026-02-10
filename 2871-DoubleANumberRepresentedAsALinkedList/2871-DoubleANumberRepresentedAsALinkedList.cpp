// Last updated: 2/10/2026, 3:11:22 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* doubleIt(ListNode* head) {
        head=reverse(head);
        ListNode* temp=head;
        int carry=0;
        ListNode* dummy=new ListNode(-1);
        ListNode* curr=dummy;
        while(temp!=nullptr){
            int sum=carry;
            sum+=temp->val*2;
            ListNode* newN=new ListNode(sum%10);
            carry=sum/10;
            curr->next=newN;
            curr=curr->next;
            temp=temp->next;
        }
        if(carry>0){
            ListNode* newR=new ListNode(carry);
            curr->next=newR;
            curr=curr->next;
        }
        ListNode* res=reverse(dummy->next);
        return res;
    }
    ListNode* reverse(ListNode* head){
        ListNode* temp=head;
        ListNode* prev=nullptr;
        while(temp!=nullptr){
            ListNode* nex=temp->next;
            temp->next=prev;
            prev=temp;
            temp=nex;
            
        }
        return prev;
    }
    
};