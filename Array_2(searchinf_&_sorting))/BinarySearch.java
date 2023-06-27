class BinarySearch {

    public static int binarySearch(int[] arr, int elem) {
        int si = 0;
        int ei = arr.length - 1;
        int mid;
        while (si <= ei) {
            mid = (ei + si) / 2;
            if (arr[mid] > elem) {
                ei = mid - 1;
            } else if (arr[mid] < elem) {
                si = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 9, 11, 12, 45 };
        int index = binarySearch(arr, 45);
        System.out.println(index);
    }
}