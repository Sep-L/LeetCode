package leetcode.editor.cn;

/**
 * @author LQZ
 * @date 2022-03-03 9:23
 */

public class Main{
    public abstract class Mother {
        public int getAge() { return 45; }
        public abstract class Son {
            public int getAge() { return 38; }
        }
        // public static void main(String[] args) {
            // Mother m = new Mother() {
            //     public int getAge() { return 22; }
            // };
            // Mother.Son s = new Son() {
            //     public int getAge() { return 57; }
            // };
            // System.out.println(s.getAge() + " " + m.getAge());
        // }
    }
}
