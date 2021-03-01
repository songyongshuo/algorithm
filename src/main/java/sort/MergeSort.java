package sort;

/**
 * 归并排序
 *
 * @author songyongshuo
 * @date 2021-02-07 21:04
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 3, 2, 1, 0};
        int[] tmp = new int[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void mergeSort(int[] a, int[] tmp, int low, int high) {
        int mid = (low + high) / 2;
        if (high - low > 1) {
            mergeSort(a, tmp, low, mid);
            mergeSort(a, tmp, mid + 1, high);
        }

        merge(a, tmp, low, mid, high);
    }

    private static void merge(int[] a, int[] tmp, int low, int mid, int high) {
        int arr1Begin = low;
        int arr1End = mid;
        int arr2Begin = mid + 1;
        int arr2End = high;

        int k = low;

        while (arr1Begin <= arr1End || arr2Begin <= arr2End) {
            if (arr1Begin > arr1End) {
                // 1号数组已经空了，填充2号数组
                tmp[k++] = a[arr2Begin++];
            } else if (arr2Begin > arr2End) {
                // 2号数组已经空了，填充1号数组
                tmp[k++] = a[arr1Begin++];
            } else {
                // 两个数组都没结束，PK
                if (a[arr1Begin] < a[arr2Begin]) {
                    tmp[k++] = a[arr1Begin++];
                } else {
                    tmp[k++] = a[arr2Begin++];
                }
            }
        }

        for (int i = low; i <= high; i++) {
            a[i] = tmp[i];
        }
    }
}
