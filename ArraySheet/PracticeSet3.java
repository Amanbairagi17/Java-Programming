package ArraySheet;

import java.util.*;

public class PracticeSet3 {
    // 22. Count frequency
    public static void frequencyCount(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);

        for (int key : freq.keySet()) {
            System.out.println(key + " frequency is : " + freq.get(key));
        }
        // return freq;
    }


    // 23. Reverse array in place
    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // 24. Rotate right by k
    public static void rotateRight(int[] arr, int k) {
        k %= arr.length;
        reversePart(arr, 0, arr.length - 1);
        reversePart(arr, 0, k - 1);
        reversePart(arr, k, arr.length - 1);
    }

    // 25. Rotate left by k
    public static void rotateLeft(int[] arr, int k) {
        k %= arr.length;
        reversePart(arr, 0, k - 1);
        reversePart(arr, k, arr.length - 1);
        reversePart(arr, 0, arr.length - 1);
    }

    private static void reversePart(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    // 26. Find largest three elements
    public static int[] largestThree(int[] arr) {
//        Arrays.sort(arr);
//        return new int[]{arr[arr.length - 1], arr[arr.length - 2], arr[arr.length - 3]};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            minHeap.add(arr[i]);
            if (minHeap.size() > 3) minHeap.poll();
        }
        System.out.println(minHeap);

        int[] ans = new int[3];
        for(int i=0 ; i<3 ; i++){
            ans[i] = minHeap.poll();
        }
        return ans;
    }

    // 27. Find smallest three elements
    public static int[] smallestThree(int[] arr) {
//        Arrays.sort(arr);
//        return new int[]{arr[0], arr[1], arr[2]};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0 ; i<arr.length ; i++){
            minHeap.add(arr[i]);
            if (minHeap.size() > 3) minHeap.poll();
        }
        System.out.println(minHeap);

        int[] ans = new int[3];
        for(int i=ans.length-1 ; i>=0 ; i--){
            ans[i] = minHeap.poll();
        }
        return ans;
    }

    // 28. Sum of even and odd separately
    public static int[] sumEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even += num;
            else odd += num;
        }
        return new int[]{even, odd};
    }

    // 29. Replace negative with zero
    public static void replaceNegatives(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) arr[i] = 0;
    }

    // 30. Replace zero with one
    public static void replaceZeroes(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) arr[i] = 1;
    }

    // 31. Difference between max and min
    public static int diffMaxMin(int[] arr) {
        return findMax(arr) - findMin(arr);
    }

    private static int findMin(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    private static int findMax(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    // 32. Pairs with given sum
    public static int[] pairsWithSum(int[] arr, int target) {
//        List<int[]> pairs = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) pairs.add(new int[]{arr[i], arr[j]});
//            }
//        }
//        return pairs;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            int complement = target - arr[i];
            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement),i};
            }
            mp.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    // 33. Check if sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1]) return false;
        return true;
    }

    // 34. Count elements greater than given number
    public static int countGreater(int[] arr, int x) {
        int count = 0;
        for (int num : arr) if (num > x) count++;
        return count;
    }

    // 35. Move zeroes to end
    public static void moveZeroes(int[] arr) {
//       int idx = 0;
//       for(int num : arr) if(num != 0) arr[idx++] = num;
//       while (idx < arr.length) arr[idx++] = 0;

        System.out.println(Arrays.toString(arr));
        int n = arr.length;

        for(int i=0,j=0 ; i<n ; i++){// This Preserve the relative order

            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    // 36. Rearrange pos/neg alternate
    public static void rearrangePosNeg(int[] arr) {
        List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }
        int i = 0, p = 0, n = 0;
        while (p < pos.size() && n < neg.size()) {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(n++);
        }
        while (p < pos.size()) arr[i++] = pos.get(p++);
        while (n < neg.size()) arr[i++] = neg.get(n++);
    }

    // 37. Majority element (Boyer-Moore)
    public static int majorityElement(int[] arr) {
        int candidate = 0, count = 0;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // 38. Intersection of arrays
    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num : arr1) set1.add(num);
        for (int num : arr2) if (set1.contains(num)) res.add(num);
        return res.stream().mapToInt(i -> i).toArray();
    }

    // 39. Union of arrays
    public static int[] union(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        return set.stream().mapToInt(i -> i).toArray();
    }

    // 40. Find missing number 1..n
    public static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = sumArray(arr);
        return expectedSum - actualSum;
    }

    private static int sumArray(int[] arr) {
        return Arrays.stream(arr).sum();
    }


    // 41. Find duplicate (only one duplicate)
    public static int findDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) return num;
            seen.add(num);
        }
        return -1;
    }

    // 42. Find element appearing once while others twice
    public static int findUnique(int[] arr) {
        int xor = 0;
        for (int num : arr) xor ^= num;
        return xor;
    }

    // 43. Max subarray sum (Kadane)
    public static int maxSubarraySum(int[] arr) {
        int currMax = arr[0], maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);
        }
        return maxSum;
    }

    // 44. Count subarrays with given sum
    public static int countSubarraysWithSum(int[] arr, int target) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        mp.put(0,1);
        int count = 0;
        int sum = 0 ;
        for(int num : arr){
            sum+=num;

            if(mp.containsKey(sum - target)){
                count+=mp.get(sum - target);
            }

            mp.put(sum , mp.getOrDefault(sum,0)+1);
        }
        return count;
    }

    // 45. Longest subarray with all distinct elements
    public static int longestDistinctSubarray(int[] arr) {
        int n = arr.length-1;
        int i=0;
        int j=0;
        int ans =0;
        Set<Integer> set = new HashSet<>();

        while (j<n){
            while (set.contains(arr[j])){
                set.remove(arr[i]);
                i++;
            }
            set.add(arr[j]);
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,66,6,7,0,32,3,5,6,1,1,3,9,0,0};
//        rotateLeft(arr,3);
//        System.out.println(Arrays.toString(arr));

//        frequencyCount(arr);
//        System.out.println(Arrays.toString(largestThree(arr)));
//        System.out.println(Arrays.toString(smallestThree(arr)));
        //System.out.println(Arrays.toString(pairsWithSum(arr,41)));
       // moveZeroes(arr);
       // System.out.println(countSubarraysWithSum(arr,1));
       // System.out.println(longestDistinctSubarray(arr));
        moveZeroes(arr);


    }
}
