package leetcode.editor.cn;

import org.junit.Test;

import java.util.*;

/**
 * @author LQZ
 * @date 2022-03-03 9:23
 */

public class Main {

    class Solution {
        public int halveArray(int[] nums) {
            double sum = 0;
            PriorityQueue<Double> heap = new PriorityQueue<>(new Comparator<Double>() {
                @Override
                public int compare(Double o1, Double o2) {
                    return (int) (o2 - o1);
                }
            });
            for (int num : nums) {
                heap.offer((double) num);
                sum += num;
            }
            double res = 0;
            int ans = 0;
            while (res < sum) {
                double num = heap.poll() / 2;
                res += num;
                heap.offer(num);
                ans++;
            }
            return ans;
        }

    }




    @Test
    public void halveArray() {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }

}

