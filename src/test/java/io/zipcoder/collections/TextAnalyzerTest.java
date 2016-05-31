package io.zipcoder.collections;


import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TextAnalyzerTest {

    private final String smallTextSample = "Hello there";
    private final String smallInputFirstWord = "Hello";
    private final String smallInputSecondWord = "there";
    private final String newlineDelimitedSmallSampleWordList = "Hello\nthere";

    private final String textSampleWithRepetition = "A man a plan a canal panama";
    private final int occurrencesOfSmallA = 2;
    private final String textSampleWithRepetionExpectedWordList = "A\t1\nman\t1\na\t2\nplan\t1\ncanal\t1\npanama\t1";

    TextAnalyzer textAnalyzer;

    @Before
    public void setup(){
        textAnalyzer = new TextAnalyzer();
    }

    @Test
    public void testWordListFromSmallSample(){
        textAnalyzer.analyzeText(smallTextSample);

        List<String> result = textAnalyzer.getWordsAsList();
        Assert.assertEquals(2, result.size());


        // Order matters in this lab, so we can test that the right words appear in the right places
        Assert.assertEquals(smallInputFirstWord, result.get(0));
        Assert.assertEquals(smallInputSecondWord, result.get(1));
    }

    @Test
    public void testWordStringFromSmallSample(){
        textAnalyzer.analyzeText(smallTextSample);
        String result = textAnalyzer.getWordsAsString();

        Assert.assertEquals(newlineDelimitedSmallSampleWordList, result);

    }

    @Test
    public void testGetIndividualWordCountNoRepetition(){
        textAnalyzer.analyzeText(smallTextSample);

        assertEquals(1, textAnalyzer.getIndividualWordCount(smallInputFirstWord));

    }

    @Test
    public void testGetIndividualWordCountWithRepetition(){
        textAnalyzer.analyzeText(textSampleWithRepetition);

        assertEquals(occurrencesOfSmallA, textAnalyzer.getIndividualWordCount("a"));

    }

    @Test
    public void testGetIndividualWordCountOnAbsentWord(){
        textAnalyzer.analyzeText(textSampleWithRepetition);

        assertEquals(0, textAnalyzer.getIndividualWordCount(smallInputSecondWord));
    }

    @Test
    public void testGetWordListWithCount(){
        textAnalyzer.analyzeText(textSampleWithRepetition);

        String wordList = textAnalyzer.getWordListWithCount();

        assertEquals(textSampleWithRepetionExpectedWordList, wordList);

    }
}
