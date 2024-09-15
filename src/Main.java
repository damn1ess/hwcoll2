import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

    public class Main {

        public static void Task1(String[] args) {
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            printOddNumbers(nums);
        }
        public static void printOddNumbers(List<Integer> nums) {
            for (int num : nums) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            };
        }
        public static void Task2() {
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            printUniqueEvenNumbersInOrder(nums);
        }
        public static void printUniqueEvenNumbersInOrder(List<Integer> nums) {
            Set<Integer> uniqueEvens = new TreeSet<>();

            for (int num : nums) {
                if (num % 2 == 0) {
                        uniqueEvens.add(num);
                }
            }
            for (int evenNum : uniqueEvens) {
                System.out.println(evenNum);
            }
        }
        public static void Task3(String[] args) {
            List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape", "orange", "kiwi"));
            printUniqueWords(words);
        }

        public static void printUniqueWords(List<String> words) {
            Set<String> uniqueWords = new HashSet<>(words);

            for (String word : uniqueWords) {
                System.out.println(word);
            }
        }
        public static void Task4(String[] args) {
            List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
            printDuplicateCounts(strings);
        }

        public static void printDuplicateCounts(List<String> strings) {
            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : strings) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            for (int count : wordCount.values()) {
                System.out.println(count - 1);
            }
        }
    }
