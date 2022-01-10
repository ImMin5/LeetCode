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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode answer;
        String num1,num2;
        
        num1 = makeNum(l1);
        num2 = makeNum(l2);
        
        String[] result = (num1.length() > num2.length() ) ? addString(num1,num2) : addString(num2,num1);
        
        
        head = new ListNode(Integer.parseInt(result[0]));
        answer = head;
        for(int i=1; i<result.length; i++){
            head.next = new ListNode(Integer.parseInt(result[i]));
            head = head.next;
        }
        
      
       
        return answer;
    }
    static String[] addString(String num1, String num2){
        StringBuilder sb = new StringBuilder();
        int q = 0 ,r = 0;
        int sum = 0;
        for(int i= 0; i<num1.length() ; i++){
            //System.out.println( (num1.charAt(i)-'0') +" " +  (num2.charAt(i)-'0')) ;
            q = num2.length() > i ? num1.charAt(i)-'0' + num2.charAt(i)-'0' : num1.charAt(i)-'0';
            q += r;
            r = q%10;
            q = q/10;
            sb.append(Integer.toString(r)); 
            r = q;   
        }
        if(r> 0) sb.append(Integer.toString(r));
    
       // System.out.println(sb);
        return sb.toString().split("");
        
    }
    static String makeNum(ListNode node){
        StringBuilder sb = new StringBuilder();
        
        while(node != null){
            sb.append(Integer.toString(node.val));
            node = node.next;
        }
        return sb.toString();
    }
}