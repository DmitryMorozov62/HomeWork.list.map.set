import java.util.*;


public class Main {
    private static final List<String> words = new ArrayList<>(List.of("Hello", "hi", "buy", "buy", "hello","hello", "hi"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer n : nums) {
            if (n % 2 == 1) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }


    public static void task2(){
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numbers = new TreeSet<>(nums);
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public static void task3(){
        System.out.println("Задача 3");
        Set<String> word = new HashSet<>(words);
        System.out.print(word);
        System.out.println();
    }

    public static void task4(){
        System.out.println("Задача 4");
        Set<String> word = new HashSet<>(words);
        System.out.println(words.size()-word.size());

    }

}