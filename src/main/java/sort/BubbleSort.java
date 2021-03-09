package sort;

/**
 * @author songyongshuo
 * @date 2021-03-04 19:49
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
