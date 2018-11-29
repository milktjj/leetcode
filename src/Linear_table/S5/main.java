package Linear_table.S5;


/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */

public class main {
    static public String longestPalindrome(String s) {
        int a = s.length();
        int maxS=0,maxE=0;
        if(a > 0) {
            for (int i = 1; i < a; ++i) {
                int start = i, end = i;

                while (isEqual(s, start, end)) {
                    --start;
                    ++end;
                }
                if ((maxE - maxS) <= (--end - ++start)) {
                    maxS = start;
                    maxE = end;
                }
            }
            //System.out.println(maxS + " " + maxE);
            for (int i = 0; i < a; ++i) {
                int start = i, end = i + 1;

                while (isEqual(s, start, end)) {
                    --start;
                    ++end;
                }
                if ((maxE - maxS) <= (--end - ++start)) {
                    maxS = start;
                    maxE = end;
                }
            }
            return s.substring(maxS, ++maxE);

        }else
            return "";

    }

    public static boolean isEqual(String s, int start, int end) {
        if (start == -1 || end == s.length())
            return false;
        if (s.charAt(start) == s.charAt(end))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));
    }
}
