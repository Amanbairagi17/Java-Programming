package Sortings;

public class Fruits {
    static void sortFruits(String [] fruit){
        int n = fruit.length;
        for (int i = 0 ;i< n-1 ;i++){
            int min_index = i;
            for (int j = i+1 ;j<n ;j++){
                if (fruit[j].compareTo(fruit[min_index])<0){
                    min_index=j;
                }

            }
            //swap arr[j] tp arr[min-index]
            String temp = fruit[i];
            fruit[i]=fruit[min_index];
            fruit[min_index]=temp;

        }
    }
    public static void main(String[] args) {
        String [] fruits ={"papaya","line","watermelon","apple","kiwi"};
        sortFruits(fruits);

        for (String val: fruits) {
            System.out.print(val + " ");
        }
    }
}
