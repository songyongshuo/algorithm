package sort;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author songyongshuo
 * @date 2021-02-07 21:28
 */
public class MergeSort2 {
    public static void main(String[] args) {
        int[] a = {1,3,7,9,0,2,4,6,8};
        int[] tmp = new int[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void mergeSort(int[] a, int[] tmp, int low, int high) {
        System.out.println(low + "----" + high);
        int mid = (low + high) / 2;
        if (high - low > 1) {
            mergeSort(a, tmp, low, mid);
            mergeSort(a, tmp, mid + 1, high);
        }

        merge(a, tmp, low, mid, high);
    }

    private static void merge(int[] a, int[] tmp, int low, int mid, int high) {
        List<String> collect = Arrays.stream(a).boxed().map(String::valueOf).collect(Collectors.toList());
        System.out.println(StringUtils.join(collect, ","));
        int arr1Begin = low;
        int arr1End = mid;
        int arr2Begin = mid + 1;
        int arr2End = high;
        int k = low;

        while (arr1Begin <= arr1End || arr2Begin <= arr2End) {
            if (arr1Begin > arr1End) {
                tmp[k++] = a[arr2Begin++];
            } else if (arr2Begin > arr2End) {
                tmp[k++] = a[arr1Begin++];
            } else {
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
