import java.util.HashMap;

public class Task3 {
    
    public static void main(String[] args) {
        String str = "Write a Java Program to count the number of words in a string using HashMap.";
        
        String[] words = str.split("\\s+");
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        
        for (String word : words) {
            
            word = word.toLowerCase();
            
            
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        
        
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
