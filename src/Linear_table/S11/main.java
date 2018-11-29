package Linear_table.S11;

public class main {
    /**
     * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * <p>
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     *
     * @param height
     * @return
     */
    static public int maxArea(int[] height) {

        /*int max = 0;
        int tmp = 0;
        for (int i = 0; i < height.length-1; ++i) {
            for (int j = i + 1; j < height.length; ++j) {

                if((tmp = (j-i) * Math.min(height[i], height[j])) > max) {
                    max = tmp;
                }
            }
        }*/

        int max=0;
        int a = 0,b=height.length-1;
        while(a<b){
            max=Math.max(max, (b-a) * Math.min(height[a], height[b]));
            if(height[a] > height[b]){
                --b;
            } else
                ++a;
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
