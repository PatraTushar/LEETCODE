package strings.InterviewQuestions;

public class Q3 {

    static String countAndSay(int n){

        if(n==1) return "1";

        String result="1";

        for(int i=2;i<=n;i++){

            StringBuilder sb=new StringBuilder();
            int j=0;

            while (j<result.length()){

                char currChar=result.charAt(j);
                int count=1;

                while ( j+1 < result.length() && currChar==result.charAt(j+1)){
                    count++;
                    j++;
                }

                sb.append(count).append(currChar);
                j++;



            }


            result=sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {

        int n=4;
        String ans=countAndSay(n);
        System.out.println(ans);

    }
}
