package ArrayQuestion;

public class App {

    static  void  printArray(int [] arr){
        for (int i =0 ;i< arr.length;i++){
            System.out.print(arr [i] + " ");

        }
        System.out.println();
    }
    static  void changeavlaue(int a ){
         a=1004;

    }

    static  void changeArray(int [] arr){

        for (int i =0 ;i< arr.length;i ++){
            arr [i] =0 ;
            //System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        changeavlaue(a);
        System.out.println(a);

        int []arr = {2,4,5,6,7};
        changeArray(arr);
        printArray(arr);

    }
}
