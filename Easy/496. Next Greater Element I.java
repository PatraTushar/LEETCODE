class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st=new Stack<>();
        int m=nums1.length;
        int n=nums2.length;
        int[] result=new int[m];
        int[] map=new int[10001];
        map[nums2[n-1]]=-1;
        st.push(nums2[n-1]);

        for(int i=n-2;i>=0;i--){

            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                map[nums2[i]]=-1;
            }

            else{
                map[nums2[i]]=st.peek();
            }

            st.push(nums2[i]);
        }

        for(int i=0;i<m;i++){
            result[i]=map[nums1[i]];
        }
        
    
    return result;
         

        
    }
}