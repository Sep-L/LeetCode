package leetcode.editor.cn;

/**
 * @author LQZ
 * @date 2022-02-24 13:13:52
 */
 
//Java：迷你语法分析器
public class ID385_MiniParser{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
/*
class Solution {

    char[] charArray;
    int cur = 0;
    int length;

    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }
        charArray = s.toCharArray();
        length = charArray.length;
        return getNext();
    }

    private NestedInteger getNext() {
        NestedInteger nestedInteger = new NestedInteger();
        // 记录整数
        int num = 0;
        // 记录正负
        int sign = 1;
        while (cur != length - 1) {
            // 忽略掉第一个左中括号
            cur++;
            if (charArray[cur] == ',') {
                continue;
            }
            if (charArray[cur] == '[') {
                nestedInteger.add(getNext());
            } else if (charArray[cur] == ']') { // 必须在这里有个返回, 让下次可以新建
                return nestedInteger;
            } else if (charArray[cur] == '-') {
                    sign = -1;
            } else {
                while (Character.isDigit(charArray[cur])) {
                    num = num * 10 + (charArray[cur++] - '0');
                }
                if (charArray[cur] == ',' || charArray[cur] == ']') {
                    // 避免在这里遇到]时没有递归
                    cur--;
                    num *= sign;
                    nestedInteger.add(new NestedInteger(num));
                    sign = 1;
                    num = 0;
                }
            }
        }
        return nestedInteger;
    }
}
*/
//leetcode submit region end(Prohibit modification and deletion)
}