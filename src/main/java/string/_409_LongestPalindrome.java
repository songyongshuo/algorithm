package string;

import java.util.HashSet;

/**
 * 409. 最长回文串
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 示例 1:
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 *
 * @author songyongshuo
 * @date 2021-01-26 11:46
 */
public class _409_LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (characters.contains(chars[i])) {
                count++;
                characters.remove(chars[i]);
            } else {
                characters.add(chars[i]);
            }
        }

        return characters.isEmpty() ? 2 * count : 2 * count + 1;
    }

    public static void main(String[] args) {
        int abccccdd = new _409_LongestPalindrome().longestPalindrome("abccccdd");
        System.out.println(abccccdd);
    }
}
