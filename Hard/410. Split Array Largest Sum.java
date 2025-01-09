class Solution {
    public int splitArray(int[] nums, int k) {

        
        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++){

            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

        while(start<end){

            // try for mid as a potential ans
            int mid=start+(end-start)/2;

            // calculate how many pieces you can divide this in with maximum sum
            int sum=0;
            int pieces=1;

            for(int i=0;i<nums.length;i++){

                if(sum+nums[i]>mid){
                    // you cannot add this in this subArray,make new one
                    // say you add this num in new subArray,then sum==num

                    sum = nums[i];
                    pieces++;

                }else {

                    sum=sum+nums[i];
                }

            }

            if(pieces>k){
                
                 start=mid+1;
            }
            
            else {

                end=mid;
                
               
            }

            






        }

        return start;   // start==end
    }
        
    }
