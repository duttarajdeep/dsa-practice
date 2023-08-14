package leetCode.String;

public class StringOps {

    public static void main(String[] args) {
        String name = "Rajdeep";
        System.out.println(reverse(name));
    }

    static String reverse(String input){
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0 ; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

}
