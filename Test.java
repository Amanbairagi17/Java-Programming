import java.util.Arrays;

public class Test{
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int low, int high, int[] arr){
        int pivot = arr[high];

        int i = low-1;

        for(int j=low ; j<=high-1 ; j++){

            if(arr[j] < pivot){
                i++;
                swap(i,j,arr);
                System.out.println(i+" "+j + " "+ pivot);
            }
        }
        swap(i+1,high,arr);
        return i+1;
    }
    public static void quickSort(int low, int high, int[] arr){
        if(low < high){
            int pivot = partition(low,high,arr);

            quickSort(low,pivot-1,arr);
            quickSort(pivot+1,high,arr);

        }
    }
    public static void main(String[] args){
        int[] arr = {9,8,3,5,1,6};


        quickSort(0,arr.length-1,arr);

//        for(int i=0 ; i<arr.length ; i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(Arrays.toString(arr));


    }
}