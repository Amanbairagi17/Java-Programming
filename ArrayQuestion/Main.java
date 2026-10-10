package ArrayQuestion;

class Arrayexample {

    void MultiArray() {
        int[][] arr = {{11, 12, 13}, {21, 23, 43}, {32, 35, 76}};

        int[][][] arr_3 = new int[5][3][2];
        arr_3[0][0][0] = 1;


    }

    void demoArray() {
        int[] ages = {12, 34, 23, 51};
        float[] weights = new float[3];
        String[] names = {"Aman", "Rohit", "Surendra", "Akshat"};

        System.out.println(ages.length);
        System.out.println(weights.length);
        System.out.println(names.length);


        for (int i = 0; i < 4; i++)
            System.out.println(ages[i]);


        for (int age : ages) {
            System.out.println(age);
        }

        int i = 0;
        while (i < 4) {
            System.out.println(ages[i]);
            i++;
        }
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


    }

    void Searchinarray() {
        int arr[] = {4, 5, 74, 23, 6};
        int x = 6;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                ans = i;
        }
        System.out.println(ans);
    }

    public class Main {
        public static void main(String[] args) {
            Arrayexample obj = new Arrayexample();

            obj.Searchinarray();

            //        int ans=0;
//        int arr[]={12,89,76,34,4};
//        for (int i =0;i< arr.length;i++)
//        {
//            if(ans<arr[i])
//                ans=arr[i];
//        }
//
//        System.out.println(ans);
        }
    }
}
