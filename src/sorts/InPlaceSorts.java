package sorts;

public class InPlaceSorts {

    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    public static void insertionSort(int arr[]) 
    {
        for (int i = 1; i < arr.length; i++)
        {
            int k = i - 1;
            while ((k > -1) && (arr[k] > arr[i]))
            {
                int temp = arr[k + 1];
                arr[k + 1] = arr[k];
                arr[k] = temp;
            }
        }
    }
}



