class Solution {
    public List<Integer> getRow(int rowIndex) {

          List<Integer> result=new ArrayList<>();

        long ans=1;
        result.add((int)ans);

        for(int i=1;i<=rowIndex;i++){

            ans=ans*(rowIndex-i+1);
            ans=ans/i;
            result.add((int)ans);



        }

        return result;
        
    }
}