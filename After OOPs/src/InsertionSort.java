public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >= 0; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3};

        insertionSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
