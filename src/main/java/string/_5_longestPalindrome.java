package string;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 *
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ac"
 * 输出："a"
 *
 * @author songyongshuo
 * @date 2021-03-01 17:41
 */
public class _5_longestPalindrome {
    public String longestPalindrome(String s) {
        int left;
        int right;
        int maxLengh = 0;
        int maxLeft = 0;

        for (int i = 0; i < s.length(); i++) {
            left = i - 1;
            right = i + 1;
            int len = 1;
            while (left >= 0 && s.charAt(i) == s.charAt(left)) {
                left--;
                len++;
            }
            while (right < s.length() && s.charAt(i) == s.charAt(right)) {
                right++;
                len++;
            }
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                len += 2;
            }

            if (len > maxLengh) {
                maxLengh = len;
                maxLeft = left;
            }
        }

        return s.substring(maxLeft + 1, maxLeft + maxLengh + 1);
    }

    public static void main(String[] args) {
        String cbbd = new _5_longestPalindrome().longestPalindrome("babad");
        System.out.println(cbbd);
    }
}
