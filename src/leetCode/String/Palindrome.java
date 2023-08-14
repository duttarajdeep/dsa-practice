package leetCode.String;

public class Palindrome {

    public static void main(String[] args) {
        String input = "abdcba";
        System.out.println(checkPalindrome(input));
    }

    static boolean checkPalindrome(String input){
        if(input == null || input.length() == 0)
            return true;

        int start = 0;
        int end = input.length() - 1;
        while(start <= end){
            if(input.charAt(start) == input.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

}
