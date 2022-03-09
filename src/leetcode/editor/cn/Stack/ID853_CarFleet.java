package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-02-26 16:37:57
 */
 
//Java：车队
public class ID853_CarFleet{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car();
            cars[i].position = position[i];
            cars[i].time = (double) (target - position[i]) / speed[i];
        }
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -Integer.compare(o1.position, o2.position);
            }
        });
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (cars[i].time < cars[i + 1].time) {
                ans++;
            } else {
                cars[i + 1] = cars[i];
            }
        }
        return ans + 1;
    }
}
class Car {
    int position;
    double time;
    public Car() {
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int target = 12;
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};
    
        Solution solution = new Solution();
        System.out.println(solution.carFleet(target, position, speed));
    }
}