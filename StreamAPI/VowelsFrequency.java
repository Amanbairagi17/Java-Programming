package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsFrequency {
    private static boolean isVowels(char c){
       c = Character.toLowerCase(c);
       return c == 'a' || c == 'o' || c == 'i' || c == 'e' || c == 'u';
    }
    public static void main(String[] args) {
        String str = "Hii aman how are u ";

        Arrays.stream(str.split("\\s+"))
                .filter(word -> word.chars()
                        .filter(ch -> isVowels((char) ch))
                        .count() == 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        Arrays.stream(str.split("\\s+"))
//                .filter(ch -> ch.replaceAll("[]"))

//        Arrays.stream(str.split("\\s+"))
//                .collect(Collectors.groupingBy(word -> word))
//                .keySet()
//                .stream()
//                .filter(word -> word.equals("aeiouAEIOU"))
//                .collect(Collectors.groupingBy(word-> w))

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Map<Boolean, List<Integer>> listMap = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));
       // Map<Boolean, List<Integer>> listMap = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()));

        System.out.println(listMap.get(true));
        System.out.println(listMap.get(false));
    }
}
