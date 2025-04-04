class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        
        int n=matrix.length;
       List<Integer> list=new ArrayList<>();

        int topRow=0;
        int bottomRow=matrix.length-1;
        int leftColumn=0;
        int rightColumn=matrix[0].length-1;


        while (topRow<=bottomRow && leftColumn<=rightColumn){

            // 1. Traverse Top Row (→)

            for (int i=leftColumn;i<=rightColumn;i++){
                list.add(matrix[topRow][i]);
            }

            topRow++;

            //2. Traverse Right Column (↓)

            for(int i=topRow;i<=bottomRow;i++){
                list.add(matrix[i][rightColumn]);
            }
            rightColumn--;


            //  3. Traverse Bottom Row (←) [check needed]

            if(topRow<=bottomRow) {


                for (int i = rightColumn; i >= leftColumn; i--) {
                    list.add(matrix[bottomRow][i]);

                }
                bottomRow--;

            }

          // 4. Traverse Left Column (↑) [check needed]

            if(leftColumn<=rightColumn) {

                for (int i = bottomRow; i >= topRow; i--) {
                    list.add(matrix[i][leftColumn]);
                }
                leftColumn++;
            }
        }

        return list;
        
    }
}