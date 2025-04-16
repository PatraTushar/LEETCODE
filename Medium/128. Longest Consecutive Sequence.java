class Solution {
    public int longestConsecutive(int[] nums) {
          HashSet<Integer> st=new HashSet();
        int maxLength=0;

        for (int num:nums){
            st.add(num);

        }

        for(int num:st){

            if(!st.contains(num-1)){        // num is a starting point of a sequence

                int currNum=num;
               int currStreak=1;

               while (st.contains(currNum+1)){
                   currStreak++;
                   currNum++;
               }

               maxLength=Math.max(maxLength,currStreak);


            }
        }

        return maxLength;

        
    }
}