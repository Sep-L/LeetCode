package leetcode.editor.cn.common;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-16 6:58
 */

public class ToArray {
    public static int[][] two(String s) {
        int rows = charFind('[', s) - 1;
        int cols = charFind(',', s.split("]")[0]) + 1;
        int index = 1, row = 0, col = 0;
        int[][] array = new int[rows][cols];
        while (row < rows) {
            char c = s.charAt(index);
            if (c == '[') {
                col = 0;
            } else if (c == ',' || c == ' ') {
                // continue;
            } else if (c == ']') {
                row++;
            } else {
                array[row][col] = c - '0';
                col++;
            }
            index++;
        }
        return array;
    }


    private static int charFind(char ch, String s) {
        int number = 0;
        int i = 0;
        while ((i = s.indexOf(ch, i)) != -1) {
            number++;
            i++;
        }
        return number;
    }

    @Test
    public void test() {
        String s = "[[1, 1]]";
        int[][] two = two(s);
        System.out.println(Arrays.deepToString(two));
    }
}
