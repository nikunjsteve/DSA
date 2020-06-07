public class OrderAgnosticBS {
    public static void main(String[] args) {
        int asc[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int desc[] = { 20, 17, 16, 14, 12, 11, 10, 9, 8, 5, 3, 2, 1 };
        int key = 11;
        int ascIndex = OrderAgnostic(asc, asc.length, key);
        int descIndex = OrderAgnostic(desc, desc.length, key);
        System.out.println("ascIndex : " + ascIndex);
        System.out.println("descIndex : " + descIndex);
    }

    public static int OrderAgnostic(int arr[], int length, int key) {
        if (arr[0] < arr[1])
            return BS(arr, length, key);
        else
            return RBS(arr, length, key);
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