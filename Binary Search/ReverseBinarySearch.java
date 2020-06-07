public class ReverseBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 20, 17, 15, 13, 12, 10, 9, 8 };
        int key = 13;
        int index = RBS(arr, arr.length, key);
        System.out.println("index of key: " + key + " is " + index);
    }

    public static int RBS(int arr[], int length, int key) {
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            else if (key > arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}