package leetcode.java.sept21;

public class Main {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(2));
        set.remove(2);
    }
}
