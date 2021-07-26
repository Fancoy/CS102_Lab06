public class NonVowel {

    public static boolean isVowel(char a){

        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') == false;
    }
    public static int totalVowel(String str, int i){

        if(i == 1){
            if(isVowel(str.charAt(0))){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(isVowel(str.charAt(i - 1))){
            return totalVowel(str, i - 1) + 1;
        }
        else{
            return totalVowel(str, i - 1);
        }
    }

    public static void main (String [] args){
        String str = "CS102 is a good course";
        System.out.println(str.length() + 1 - (totalVowel(str, str.length()))); // Ask
    }
}
