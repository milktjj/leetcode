package Linear_table.S7;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class main {
    static public int reverse(int x) {

        int flag = -1;
        if(x < 0)
            x = x * -1;
        else
            flag = 1;
        long y = 0;
        for (int i = 0;x > 0; ++i) {

            y = y*10 + x%10;
            x=x/10;
        }
        if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
            return 0;
        return (int) (y * flag);
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
