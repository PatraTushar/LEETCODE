class Solution {

    static List<String> pad(String ans,String str){

      List<String> list=new ArrayList<>();

      if(str.isEmpty()){
        list.add(ans);
        return list;
      }
        char ch=str.charAt(0);
        int digits=ch-'0';

          String[] digitsToLetter={"", "", "abc", "def" , "ghi","jkl","mno","pqrs","tuv","wxyz"};
        
          if (digits < 2 || digits > 9) return new ArrayList<>();

          String letters=digitsToLetter[digits];

           for(int i=0;i<letters.length();i++){

            char A=letters.charAt(i);

            list.addAll(pad(ans + A,str.substring(1)));
           }



           
  return list;

    }
    public List<String> letterCombinations(String digits) {
        String ans="";

        if(digits.equals(ans)) return new ArrayList<>();
        List<String> finalAns=pad(ans,digits);

        return finalAns;


        
    }
}