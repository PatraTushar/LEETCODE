package strings.InterviewQuestions;

public class Q4 {

    static String IntegerToRoman(int num){

        //Time Complexity (TC): O(1)
        //Space Complexity (SC): O(1)

        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols ={"M", "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<values.length;i++){

            while (num>=values[i]){
                num-=values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();


    }

    

    public static void main(String[] args) {

        int num=3749;
        String ans=IntegerToRoman(num);
        System.out.println(ans);


    }
}
