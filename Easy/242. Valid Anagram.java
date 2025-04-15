class Solution {

      static Map<Character,Integer> makeFreq(String str){

        Map<Character,Integer> mp=new HashMap<>();

       for (int i=0;i<str.length();i++){

           if(!mp.containsKey(str.charAt(i))){
               mp.put(str.charAt(i),1);
           }

           else {
               mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
           }
       }

       return mp;
    }
    public boolean isAnagram(String s, String t) {

         if(s.length()!=t.length() ) return false;


        Map<Character,Integer> m1=makeFreq(s);
        Map<Character,Integer> m2=makeFreq(t);




        return m1.equals(m2);

        
    }
}