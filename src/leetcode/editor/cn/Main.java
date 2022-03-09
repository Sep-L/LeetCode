package leetcode.editor.cn;

/**
 * @author LQZ
 * @date 2022-03-03 9:23
 */

public class Main {
    // 数组, 表示并查集所有元素
    private int[] parent;
    // 并查集的元素个数
    private int size;

    public Main(int size) {
        // 用给定的 size 初始化一个数组
        this.size = size;
        parent = new int[size];
        // 初始时数组内的值与数组的下角标一致, 即每个数字单独为一组
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    /**
     * 查看元素属于哪个集合
     */
    public int find(int element) {
        // 不相等, 说明当前元素有上一级的父节点
        // 循环找到最上级的父节点
        while (element != parent[element]) {
            element = parent[element];
        }
        // 返回最终父节点属于的集合
        return parent[element];
    }

    /**
     * 判断两个元素是否同属于一个集合
     */
    public boolean isConnected(int firstElement, int secondElement) {
        return find(firstElement) == find(secondElement);
    }

    /**
     * 合并两个元素所在的集合
     */
    public void union(int firstElement, int secondElement) {
        //找出 firstElement 的最终父节点
        int firstRoot = find(firstElement);
        //找出 secondElement 的最终父节点
        int secondRoot = find(secondElement);

        //如果这两个不是同一个集合, 那么合并.
        if (firstRoot != secondRoot) {
            // 修改 firstRoot 使它的上级父节点是 secondRoot
            parent[firstRoot] = secondRoot;
        }
    }
}