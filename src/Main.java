import java.util.Objects;

public class Main {

    /* use the following methods:
        .length();
        .substring(start, finish) doesn't include finish
        .substring(start) goes to end
        .indexOf(someString)
        .equals(otherString)
     */
    public static void main(String[] args) {
        System.out.println(VowelCount("This is a string."));
        System.out.println("Correct output: 4");
        System.out.println(VowelCount(""));
        System.out.println("Correct output: 0");
        System.out.println(VowelCount("AEIOU"));
        System.out.println("Correct output: 5");
        ///////////////////////////////////////////////////////////////////////////
        System.out.println(VowelRemover("Remove all of the vowels."));
        System.out.println("Correct output: Rmv ll f th vwls");
        //////////////////////////////////////////////////////////////////////////
        System.out.println(ContainsSubstring("Sentence","ten"));
        System.out.println("Correct output: true");
        //////////////////////////////////////////////////////////////////////////
        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");
        //////////////////////////////////////////////////////////////////////////
        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
    }

    /**
     * Count the vowels in the input string regardless of case
     * @param input String
     * @return vowel count int
     */
    public static int VowelCount(String input){
        int length = input.length();
        String lowerCaseInput = input.toLowerCase();
        int count = 0;
        for(int i = 0; i<length; i++){
            String letter = lowerCaseInput.substring(i,i+1);
            if(letter.equals("a")||letter.equals("e")||letter.equals("i")
            ||letter.equals("o")||letter.equals("u")){
                count++;
            }
        }

        return count;
    }

    /**
     * Returns a string with all vowels removed regardless of case
     * @param input String
     * @return String with no vowels
     */

    public static String VowelRemover(String input){
        //find length
        int length = input.length();
        //make new String
        String noVowels = "";
        //for loop to
        for(int i = 0; i<length; i++){
            String inputLetter = input.substring(i,i+1);
            if(!inputLetter.toLowerCase().equals("a")&&!inputLetter.toLowerCase().equals("e")&&!inputLetter.toLowerCase().equals("i")
                    &&!inputLetter.toLowerCase().equals("o")&&!inputLetter.toLowerCase().equals("u")){
                noVowels+=inputLetter;
            }
        }
        return noVowels;
    }


    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){
        int length = input.length();
        int targetLength = target.length();
        for(int a=0; a<length; a++){
            for(int b=0; b<targetLength;b++){
                if(input.substring, target.substring(b, b + 1))){
                    if(input.substring(a,a+1).equals(target.substring(b,b+1))
            }


            }
        }

        return false;
    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){

        return "";
    }

    /**
     * Determines if a given string is palindrome
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean PalindromeChecker(String input){

        return false;
    }
}
