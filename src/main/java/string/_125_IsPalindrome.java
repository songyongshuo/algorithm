package string;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * @author songyongshuo
 * @date 2021-01-26 13:54
 */
public class _125_IsPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (r > l) {
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            } else if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            } else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                r--;
                l++;
            }
        }
        return true;
    }
}
