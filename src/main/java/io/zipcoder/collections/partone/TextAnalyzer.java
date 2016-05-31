package io.zipcoder.collections.partone;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TextAnalyzer {


    private Set<String> uniqueWords;

    public TextAnalyzer(){
        uniqueWords = new LinkedHashSet<>();
    }

    public void analyzeText(String plainText){
        for(String s: plainText.split("\\s+")){
            uniqueWords.add(s);
        }
    }

    public List<String> getWordsAsList(){
        return new ArrayList<>(uniqueWords);
    }

    public String getWordsAsString(){
        StringBuilder sb = new StringBuilder();
        for(String s: uniqueWords){
            sb.append(s);
            sb.append("\n");
        }
        if(sb.length() > 0) sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}
