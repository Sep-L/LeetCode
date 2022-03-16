package leetcode.editor.cn.UnionFind_in;

import org.junit.Test;

import java.util.*;

/**
 * @author LQZ
 * @date 2022-03-13 10:12:58
 */
 
//Java：账户合并
public class ID721_AccountsMerge{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private String[] parent;
    private Map<String, String> emails;
    private Map<String, String> names;

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        parent = new String[n];
        // 根邮箱（父节点）
        emails = new HashMap<>();
        // 根邮箱与账号名称的对应关系
        names = new HashMap<>();

        for (List<String> account : accounts) {
            // 确定名字
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                if (!emails.containsKey(email)) {
                    // 先把每个邮箱单独分成一组
                    emails.put(email, email);
                    // 添加该邮箱对应的账户名
                    names.put(email, name);
                }
                // 第一个后面的邮箱都要拼在首位的邮箱或者它的根邮箱后面
                if (i > 1) {
                    union(email, account.get(i - 1));
                }
            }
        }
        // 根邮箱以及它的所有子邮箱的对应关系
        Map<String, List<String>> res = new HashMap<>();
        for (String email : emails.keySet()) {
            // 查找根邮箱
            String rootEmail = find(email);
            if (!res.containsKey(rootEmail)) {
                res.put(rootEmail, new ArrayList<>());
            }
            res.get(rootEmail).add(email);
        }

        // 用姓名替换根邮箱, 子邮箱拼在后面
        List<List<String>> ans = new ArrayList<>();
        for(String root : res.keySet()) {
            List<String> temp = res.get(root);
            Collections.sort(temp);
            temp.add(0, names.get(root));
            ans.add(temp);
        }

        return ans;
    }

    private String find(String email) {
        while (!email.equals(emails.get(email))) {
            email = emails.get(email);
        }
        return email;
    }

        private void union(String subEmail, String mainEmail) {
        String rootA = find(subEmail);
        String rootB = find(mainEmail);
        if (!rootA.equals(rootB)) {
            // 执行耗时:74 ms,击败了15.31% 的Java用户
            // 内存消耗:44.7 MB,击败了53.88% 的Java用户
            emails.put(rootA, rootB);
            // 执行耗时:758 ms,击败了8.13% 的Java用户
            // 内存消耗:44.7 MB,击败了54.45% 的Java用户
            // emails.put(rootB, rootA);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("johnsmith@mail.com");
        list.add("john00@mail.com");
        lists.add(list);

        list = new ArrayList<>();
        list.add("John");
        list.add("johnnybravo@mail.com");
        lists.add(list);

        list = new ArrayList<>();
        list.add("John");
        list.add("johnsmith@mail.com");
        list.add("john_newyork@mail.com");
        lists.add(list);

        list = new ArrayList<>();
        list.add("Mary");
        list.add("mary@mail.com");
        lists.add(list);

        Solution solution = new Solution();
        System.out.println(solution.accountsMerge(lists));
    }
}