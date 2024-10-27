import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Babloo");
        // System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0, 'D');
        // System.out.println(sb);

        // // insert char
        // sb.insert(3, 'a');
        // System.out.println(sb);

        // // Delete the extra 'n'
        // sb.delete(2, 4);
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder("H");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println(sb.length());
        // System.out.println(sb.reverse());

        StringBuilder sb = new StringBuilder("Hello");

        for(int i=0;i<sb.length()/2;i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 => 4

            char frontChar = sb.charAt(front);
            char endChar = sb.charAt(back);

            sb.setCharAt(front, endChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
