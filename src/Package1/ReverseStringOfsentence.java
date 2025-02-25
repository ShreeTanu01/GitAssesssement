package Package1;

public class ReverseStringOfsentence {

	
	
	

	    public static void main(String[] args) {
	        String sentence = "This is a test sentence";
	        
	        // Step 1: Split the sentence into words
	        String[] words = sentence.split(" ");
	        
	        // Step 2: Reverse each word
	        StringBuilder reversedSentence = new StringBuilder();
	        
	        for (String word : words) {
	            // Reverse the word and append it to the result
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
	        }
	        
	        // Step 3: Remove the trailing space
	        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
	    }
	
}
