class Solution {
    public int minAddToMakeValid(String s) {

        int insertion=0;
        int balance=0;

        for(char ele : s.toCharArray()){

            if(ele=='('){

                balance++;
            }

            else{

                if(balance>0)  balance--;
                else insertion++;
                   
            }
        }

        return balance + insertion;

    }
}