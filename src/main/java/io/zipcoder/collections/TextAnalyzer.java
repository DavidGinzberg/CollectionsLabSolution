package io.zipcoder.collections;


import java.util.*;

//See package io.zipcoder.collections.partone for sample answer to Part 1
public class TextAnalyzer {


    private Map<String, Integer> uniqueWords;

    public TextAnalyzer(){
        uniqueWords = new LinkedHashMap<>();
    }

    public void analyzeText(String plainText){
        for(String s: plainText.split("\\s+")){
            int count = 1;
            if(uniqueWords.containsKey(s))
                count += uniqueWords.get(s);
            uniqueWords.put(s, count);
        }
    }

    public List<String> getWordsAsList(){
        return new ArrayList<>(uniqueWords.keySet());
    }

    public String getWordsAsString(){
        StringBuilder sb = new StringBuilder();
        for(String s: uniqueWords.keySet()){
            sb.append(s);
            sb.append("\n");
        }
        removeTrailingNewline(sb);
        return sb.toString();
    }

    private void removeTrailingNewline(StringBuilder sb) {
        if(sb.length() > 0) sb.deleteCharAt(sb.length()-1);
    }

    public int getIndividualWordCount(String word){
        Integer count =  uniqueWords.get(word);
        if(null == count) count = 0;
        return count;
    }

    public String getWordListWithCount(){
        StringBuilder wordListBuilder = new StringBuilder();
        for(String s: uniqueWords.keySet()){
            wordListBuilder.append(s);
            wordListBuilder.append("\t");
            wordListBuilder.append(uniqueWords.get(s));
            wordListBuilder.append("\n");

        }
        removeTrailingNewline(wordListBuilder);
        return wordListBuilder.toString();
    }


}
