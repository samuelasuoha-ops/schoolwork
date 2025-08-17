//Student ID: C00305107
//Date: 12/02/2025
package labEight;

import java.io.*;
import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Words.txt"));
            String line;
            // Read words from file into list
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: Words.txt not found. Please ensure the file exists.");
            return;
        }
        
        if (words.isEmpty()) {
            System.out.println("Error: No words found in Words.txt.");
            return;
        }
        
        Random random = new Random();
        // Select a random word from the list
        String chosenWord = words.get(random.nextInt(words.size()));
        char[] outputWord = new char[chosenWord.length()];
        Arrays.fill(outputWord, '-');
        
        int guesses = 10;
        Scanner scan = new Scanner(System.in);
        
        while (guesses > 0) {
            System.out.println("\nWord: " + String.valueOf(outputWord));
            System.out.println("Remaining guesses: " + guesses);
            System.out.print("Guess a letter: ");
            
            char input = scan.next().charAt(0);
            boolean found = false;
            boolean won = true;
            
            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == input) {
                    outputWord[i] = input;
                    found = true;
                }
                if (outputWord[i] == '-') {
                    won = false;
                }
            }
            
            if (!found) {
                guesses--;
            }
            
            if (won) {
                System.out.println("Congratulations! You guessed the word: " + chosenWord);
                updateResult("WIN");
                scan.close();
                return;
            }
        }
        
        System.out.println("Out of guesses! The word was: " + chosenWord);
        updateResult("LOSE");
        scan.close();
    }
    
    public static void updateResult(String result) {
        try {
            FileWriter fw = new FileWriter("Result.txt", true);
            fw.write(result + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}