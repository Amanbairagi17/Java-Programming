package ArrayQuestion;

public class findduplicate {
    public static void main(String[] args) {
        int arr[]= {1,3,4,3,2,2};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println(i + "occurs " + count[i] + " times");
            }
        }
    }
}
