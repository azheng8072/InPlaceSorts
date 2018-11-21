package sorts;

public class Runner
{

    public static void main(String[] args)
    {
            int[] arr = new int[]{5,2,3,1,4};
//            InPlaceSorts.bubbleSort(arr);
            InPlaceSorts.insertionSort(arr);
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
    }

}
