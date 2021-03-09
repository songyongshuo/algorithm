package sort;

/**
 * @author songyongshuo
 * @date 2021-03-04 15:49
 */
public class QuickSort {
    private static int devide(int[] arr, int l, int r) {

        int base = arr[r];
        while (l < r) {
            while (l < r && arr[l] < base) {
                l++;
            }
            if (l < r) {
                int tmp = arr[r];
                arr[r] = arr[l];
                arr[l] = tmp;
                r--;
            }
            while (l < r && arr[r] > base) {
                r--;
            }
            if (l < r) {
                int tmp = arr[r];
                arr[r] = arr[l];
                arr[l] = tmp;
                l++;
            }
        }

        return r;
    }

    private static void sort(int[] arr, int l, int r) {
        if (l > r) {
            return;
        }

        int devide = devide(arr, l, r);
        sort(arr, l, devide - 1);
        sort(arr, devide + 1, r);
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
        int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};

        sort(d, 0, d.length-1);

        System.out.println("排序后的结果：");
        for(int x : d){
            System.out.print(x+" ");
        }
    }
}
