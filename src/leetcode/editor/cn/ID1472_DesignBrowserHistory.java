package leetcode.editor.cn;

/**
 * @author LQZ
 * @date 2022-02-27 13:32:49
 */
 
//Java：设计浏览器历史记录
public class ID1472_DesignBrowserHistory{
    //leetcode submit region begin(Prohibit modification and deletion)
class BrowserHistory {
    private DoubleLinkedList  head;
    public BrowserHistory(String homepage) {
        head = new DoubleLinkedList (homepage);
    }
    
    public void visit(String url) {
        head.next = new DoubleLinkedList(url);
        DoubleLinkedList  temp = head;
        head = head.next;
        head.prev = temp;
    }
    
    public String back(int steps) {
        while (steps > 0 && head.prev != null) {
            head = head.prev;
            steps--;
        }
        return head.value;
    }
    
    public String forward(int steps) {
        while (steps > 0 && head.next != null) {
            head = head.next;
            steps--;
        }
        return head.value;
    }

    class DoubleLinkedList {
        String value;
        DoubleLinkedList  prev;
        DoubleLinkedList  next;
        public DoubleLinkedList (String value) {
            this.value = value;
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
//leetcode submit region end(Prohibit modification and deletion)

}