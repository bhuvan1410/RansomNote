public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] letterArray = new int[26];

        for(char i: magazine.toCharArray()){
            letterArray[i-'a']++;
        }

        for(char j:ransomNote.toCharArray()){

            if(letterArray[j-'a'] == 0){
                return false;
            }

            else{
                letterArray[j-'a']--;
            }


        }

        return true;


    }




    public static void main(String[] args){

        String ransomNote1,ransomNote2,ransomNote3;
        String magazine1,magazine2,magazine3;
        boolean construct1,construct2,construct3;

        ransomNote1 = "a";
        magazine1 = "b";

        ransomNote2 = "aa";
        magazine2 = "ab";

        ransomNote3 = "aa";
        magazine3 = "aab";

        construct1 = canConstruct(ransomNote1,magazine1);
        construct2 = canConstruct(ransomNote2,magazine2);
        construct3 = canConstruct(ransomNote3,magazine3);




        System.out.println("the ransom note and magazine for the first case is "+ransomNote1+" and "+magazine1+" and it is "+construct1);
        System.out.println("the ransom note and magazine for the second case is "+ransomNote2+" and "+magazine2+" and it is "+construct2);
        System.out.println("the ransom note and magazine for the third case is "+ransomNote3+" and "+magazine3+" and it is "+construct3);




    }

}
