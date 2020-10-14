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
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately  into paranoid avoidable situations";
					
		HashMap<String,Integer> LinkedListHashMap = new HashMap<>();
		String words[] = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =  LinkedListHashMap.get(word);
			value = (value==null)?1:++value;
			LinkedListHashMap.add(word,value);
		}
		System.out.println(LinkedListHashMap);
		Integer frequency = LinkedListHashMap.get("paranoid");
		if(frequency==null)
			System.out.println("f is null");
		assertEquals(3, (int)frequency);
		
	}
}
