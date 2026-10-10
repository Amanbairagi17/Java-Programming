package College;

public class CopyArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("Existing Array : ");
        for (int i=0 ; i<n ;i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] brr = new int[n];
        System.out.println("After copying  :");
        for (int i=0 ; i<n ;i++){
            brr[i]=arr[i];
            System.out.print(brr[i]+" ");
        }
    }
}
