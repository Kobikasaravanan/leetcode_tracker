// Last updated: 28/8/2026, 2:49:06 pm
class Solution {
    public void reverseString(char[] s) {
        int left =0;
        int right=s.length-1;
        while(left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        
    }
}