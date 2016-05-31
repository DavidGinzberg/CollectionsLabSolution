# Collections Lab:


## Unit Tests

You are expected to write unit tests for your code. Be sure to write the tests before implementing the functionality being tested. Tests must be thorough and address all possible paths through each method.



## Instructions:

For this lab you will need to create a class called `TextAnalyzer` to house the methods described in parts 1 and 2.

### Part I:

In this part you will analyze a large body of text and keep track of each word found in the text.

Create a method called `analyzeText` which takes a body of text and analyzes it, storing the result of the analysis in a collection that is part of your `TextAnalyzer` class.

Create another method, called `getWordsAsList`, which returns a `List` of each word found in the document (no duplicates), in the order they first appeared.

Finally, add a method called `getWordsAsString`, which returns the list of each word (described above) as a single String. You may choose how to format this String but try to choose something that makes it easy to tell where one word ends and the next one begins.

### Part II:

Refactor your existing code to keep track of how many times each word has occurred in the analyzed text. You will need to adjust the way you store the results of analysis to associate the number of occurrences of a particular word with that word (*hinthint*). The three methods you have already defined should still work as described, but you should also be able to provide the following functionality:

Add a method called `getIndividualWordCount` which takes a string as its only parameter and returns an integer representing the number of times that word appeared in the analyzed text.

Add a method called `getWordListWithCount` which returns a string showing each word, followed by the number of times that word occurred in the analyzed text. The String should be formatted so it is easy to distinguish one word and its quantity from the next (one word per line is recommended, but not required).


**Text samples:**

[Project Gutenberg eBooks](http://norvig.com/big.txt)  
[US Declaration of Independence](http://www.constitution.org/usdeclar.txt)  
[IPoAC with QoS RFC](https://tools.ietf.org/rfc/rfc2549.txt)
