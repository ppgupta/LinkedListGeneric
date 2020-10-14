package com.bridgelabz.capgemini.linkedlistgeneric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashMapTest {
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnFrequency() {
		String sentence = "to be or not to be";
		HashMap<String,Integer> myHashMap = new HashMap<>();
		String words[] = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHashMap.get(word);
			value = (value==null)?1:++value;
			myHashMap.add(word,value);
		}
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		assertEquals(2,frequency);
	}
}
