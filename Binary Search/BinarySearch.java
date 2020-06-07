public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 8;
        int index = BS(arr, arr.length, key);
        System.out.println("index of " + key + " is " + index);
    }

    public static int BS(int arr[], int length, int key) {
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            else if (key > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}