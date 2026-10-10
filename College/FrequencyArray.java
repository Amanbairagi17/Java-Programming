package College;

public class FrequencyArray {
    public static void findHighestAndLowestFreq(int [] nums){
        int n = nums.length;
        boolean[] visited = new boolean[n];

        int maxEle = 0, maxFreq = 0;
        int minEle = 0, minFreq = n;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1; // Start with 1 as nums[i] counts as one occurrence
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true; // Mark duplicates as visited
                    count++;
                }
            }

            // Update max element and frequency
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = nums[i];
            }

            // Update min element and frequency
            if (count < minFreq) {
                minFreq = count;
                minEle = nums[i];
            }
        }
        System.out.println(minEle);
        System.out.println(maxEle);

    }
    public static void main(String[] args) {
        int arr[]= {1,3,4,3,2,2};
        findHighestAndLowestFreq(arr);
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            max = Math.max(max,arr[i]);
//        }
//        int count[] = new int[max+1];
//        for(int i=0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//        for(int i=0;i<count.length;i++){
//            if(count[i]>0){
//                System.out.println(i + " occurs " + count[i] + " times");
//            }
//        }
    }

}
