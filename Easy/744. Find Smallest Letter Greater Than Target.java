class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

         int start=0,end=letters.length-1,N=letters.length;


        while(start<=end){

            int mid=start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }
            else{   // target > letters[mid]
                start=mid+1;
            }
        }


        return letters[start%N];


    }

        
    }
