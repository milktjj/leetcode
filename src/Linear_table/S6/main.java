package Linear_table.S6;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * <p>
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 */

public class main {
    public String convert(String s, int numRows) {
        StringBuilder[] newS = new StringBuilder[numRows];
        if (numRows == 1) {


            for (int i = 0; i < numRows; ++i)
                newS[i] = new StringBuilder();
            int j = 0;
            boolean flag = false;
            for (int i = 0; i < s.length(); ++i) {
                if (j == 0 || j == numRows - 1)
                    flag = !flag;
                if (flag) {
                    //System.out.println(j++);
                    newS[j++].append(s.charAt(i));
                } else {
                    //System.out.println(j--);
                    newS[j--].append(s.charAt(i));
                }

            }
            for (int i = 1; i < numRows; ++i)
                newS[0].append(newS[i].toString());
            return newS[0].toString();

        } else
            return s;
    }

    public static void main(String[] args) {
        int j=0;
        boolean flag = false;
        for(int i=0; i < 10; ++i){
            if(j == 0 || j == 3)
                flag = !flag;
            if(flag)
                System.out.println(j++);
            else
                System.out.println(j--);
        }
    }
}
