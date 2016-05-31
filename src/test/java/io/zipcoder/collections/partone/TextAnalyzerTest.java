package io.zipcoder.collections.partone;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TextAnalyzerTest {

    private final String smallTextSample = "Hello there";
    private final String smallInputFirstWord = "Hello";
    private final String smallInputSecondWord = "there";
    private final String newlineDelimitedSmallSampleWordList = "Hello\nthere";
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
}
