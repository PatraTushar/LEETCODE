class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

                Arrays.sort(nums1);
                Arrays.sort(nums2);
         int i=0;
        int j=0;

        ArrayList<Integer> list=new ArrayList<>();

        while (i<nums1.length && j<nums2.length){

            if(nums1[i]==nums2[j]){

               if(list.isEmpty() || list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);

               }

               i++;
               j++;


            }


            else if(nums1[i]<nums2[j]) {
                i++;

            }

            else {
                j++;
            }




        }


        int[] result=new int[list.size()];

        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }

        return result;

      
        
    }
}