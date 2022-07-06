package com.codedifferently.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        input = input.toLowerCase();
        letter = letter.toLowerCase();
        String[] words = input.split(" ");
        Map<String, Integer> letterMap = new HashMap<>();
        for (String word : words) {
            String[] letters = word.split("");
            for (String character : letters) {
                int count = letterMap.getOrDefault(character, 0);
                letterMap.put(character, ++count);
            }
        }
        return letterMap.get(letter);
    }
}
