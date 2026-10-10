package College;

public class FindLargest {
    static int findMax(int [] arr){
        int max = -1;//  we take arr[0] as max value
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int [] arr) {
        int max=findMax(arr);// find first element of the array from findMax
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                arr[i] = -1;
        }
        int secMax = findMax(arr);
        return secMax;

    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,0,9};

        System.out.println(secondMax(arr));
    }
}
