public class SmallestDistance {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 8, 6, 1, 2, 9, 4};
        System.out.println("The index of the first number is the following: " + findSmallestDistance(arr));
    }

    static int findSmallestDistance(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (Math.abs(arr[index] - arr[index + 1]) > Math.abs(arr[i] - arr[i + 1])) {
                index = i;
            }
        }
        return index;
    }
}
