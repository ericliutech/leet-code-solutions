public class Solution {
    public String reverseWords(String s) {
        String[] fragment = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fragment.length; i++){
            for(int j = fragment[i].length() - 1; j >= 0 ; j--){
                sb.append(fragment[i].charAt(j));
            }
            if (i < fragment.length - 1) sb.append(' ');
        }
        return sb.toString();
    }
}