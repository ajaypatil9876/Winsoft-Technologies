public class Task4 {
    
    public static void findDuplicates(String str) {
        int[] charCounts = new int[256]; 
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            charCounts[ch]++;
        }
        
        System.out.println("Duplicate Characters:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1 && Character.isLetterOrDigit((char) i)) {
                System.out.println((char) i + " - " + charCounts[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String text = "Ajay";
        
        findDuplicates(text);
    }
}