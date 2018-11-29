package Linear_table.S10;

public class main {
    static public boolean isMatch(String s, String p) {
        //if (a > s.length() ||)
        if (s.length() == 0)
            return true;
        for (int k = 0; k < p.length(); ++k) {
            /**
             *   asfswqeq
             *   *.qeq
             */
            if (p.charAt(k) == '*') {
                if (p.length() > 1)
                    ++k;
                else
                    return true;
                if (p.charAt(k) == '*')
                    return isMatch(s, p.substring(k, p.length()));
                if (p.charAt(k) == '.') {
                    if (p.length() > 2) {
                        for (int i = 0; i < s.length(); ++i) {
                            if (s.charAt(i) == p.charAt(k + 1))
                                return isMatch(s.substring(++i, s.length()), p.substring(k + 1, p.length()));
                        }
                    }
                    return true;
                } else {
                    for (int i = 0; i < s.length(); ++i) {
                        if (s.charAt(i) == p.charAt(k)) {
                            if (s.length() > 2 && p.length() > 2)
                                return isMatch(s.substring(++i, s.length()), p.substring(k + 1, p.length()));
                            else
                                return true;
                        }

                    }
                    return true;
                }
            } else if (p.charAt(k) == '.') {
                return isMatch(s.substring(1, s.length()), p.substring(k + 1, p.length()));
            } else {
                if (s.charAt(0) == p.charAt(k)) {
                    return isMatch(s.substring(1, s.length()), p.substring(k + 1, p.length()));
                } else
                    return isMatch(s, p.substring(k + 1, p.length()));
            }


        }

        return false;

    }
    static class Solution {
        static public boolean isMatch(String s, String p) {

            int sLength = s.length();
            int pLength = p.length();

            if (0 == sLength && 0 == pLength) {
                return true;
            }

            char s0 = getCharWithoutOverSteo(s, 0), p0 = getCharWithoutOverSteo(p, 0), p1 = getCharWithoutOverSteo(p, 1);
            if (isMatchCharacter(s0, p0) || p1 == '*') {
                if (p1 != '*') {
                    if (sLength == 0) {
                        return false;
                    }
                    return isMatch(s.substring(1), p.substring(1));

                }

                int i = 0;
                boolean ret = isMatch(s.substring(0), p.substring(2));
                if (ret)
                    return ret;
                while (i < sLength && isMatchCharacter(getCharWithoutOverSteo(s, i), p0)) {
                    ret = isMatch(s.substring(i + 1), p.substring(2));
                    if (ret)
                        return ret;
                    i++;
                }
            }

            return false;
        }

        private static Boolean isMatchCharacter(char a, char b) {

            if (a == b||a=='.'||b=='.') {
                return true;
            }

            return false;

        }

        private static Character getCharWithoutOverSteo(String s, int index) {
            if (s.length() > index) {
                return s.charAt(index);
            }
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(Solution.isMatch("aa"
                ,"a*"));
    }

}
