class Solution {
    public int[] getConcatenation(int[] nums) {
           int p[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            p[i]=nums[i];
        }
        int n=nums.length+p.length;
         List<Integer> m=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
         {
             m.add(nums[i]);
            
         }
         for(int j=0;j<p.length;j++)
         {
             m.add(p[j]);
         }
          int[] arr = m.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}