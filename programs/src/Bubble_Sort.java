import java.util.Arrays;

class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {0,8,1,9,7};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        int l = arr.length;

        for (int i = 0; i <= l - 1; i++) {
            for (int j = i + 1; j <= l - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}