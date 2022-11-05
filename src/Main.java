public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr1[] = new int[4];
        int j =0;
        for (int i = arr.length -1; i >= 0; i--) {
            arr1[j] = arr[i];
            System.out.println(arr1[j]);
            j++;


        }


    }
}