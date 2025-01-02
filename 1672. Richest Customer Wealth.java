class Solution {
    public int maximumWealth(int[][] accounts) {

          int max=Integer.MIN_VALUE;

        for(int rows=0;rows<accounts.length;rows++){

            int sum=0;

            for(int columns=0;columns<accounts[rows].length;columns++){

                sum=sum+accounts[rows][columns];


            }

            if(sum>max){
                max=sum;
            }


        }

        return max;
        
    }
}