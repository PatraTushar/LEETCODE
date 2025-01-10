class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Step 1: Find the maximum number of candies in the array

         int maxCandies=candies[0];
        for(int candy:candies){

            if(candy>maxCandies){
                maxCandies=candy;
                
            }

        }
        

        // Step 2: Create a list to store results

        List<Boolean> result=new ArrayList<>();


        // Step 3: Check each kid if they can have the maximum candies with extra candies

        for(int candy:candies){
            if(candy+extraCandies>=maxCandies){
                result.add(true);
            }

            else{

                result.add(false);
            }
        }

        return result;

        
    }
}