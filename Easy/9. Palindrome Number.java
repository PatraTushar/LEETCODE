class Solution {
    public boolean isPalindrome(int x) {
        int ans=0, target=x;

       while(x>0){

          int rem=x%10;
          ans=ans*10+rem;
          x=x/10;
         

       }

       if(ans==target){
        return true;
       }

       


     return false;   
    }
}