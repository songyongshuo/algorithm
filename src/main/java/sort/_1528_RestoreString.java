package sort;

/**
 *
 * 1528. 重新排列字符串
 * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
 *
 * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
 *
 * 返回重新排列后的字符串。
 *
 * @author songyongshuo
 * @date 2020-12-28 15:55
 */
public class _1528_RestoreString {
    public String restoreString(String s, int[] indices) {
        if (s.length() != indices.length) {
            return "";
        }

        char[] result = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String s = new _1528_RestoreString().restoreString("cba", new int[]{2, 1, 0});
        System.out.println(s);
    }
}