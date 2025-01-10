class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count=0;
          // Create a frequency array for numbers from 1 to 100 (size 101)
        int freq[]=new int[101];


        // Traverse the nums array
        for(int a:nums){

        // Add the number of times 'a' has appeared before (which is in freq[num])

            count=count+freq[a];


            // Increment the frequency of the current number
            freq[a]++;
        }
        

        return count;
    }
}