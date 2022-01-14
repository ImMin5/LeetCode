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

import java.util.*;

class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; head != null; i++){
            sb = sb.append(head.val);
            head = head.next;
        }
        
        sb = sb.reverse();
        int len = sb.length();
        
        for(int i=0; i<len; i++){
            if(sb.charAt(i) == '1') sum += Math.pow(2,i);
        }
        return sum;
    }
}