class Solution {
    public boolean isIsomorphic(String s, String t) {

           
        Map<Character,Character> mp=new HashMap<>();

        for(int i=0;i<s.length();i++){

            char sCh=s.charAt(i);
            char tCh=t.charAt(i);

            if(mp.containsKey(sCh)){

                if(mp.get(sCh)!=tCh) return false;
            }

            else if(mp.containsValue(tCh)){
                return false;


            }

            else {

                mp.put(sCh,tCh);
            }

        }

        return true;
    }

        
    }
