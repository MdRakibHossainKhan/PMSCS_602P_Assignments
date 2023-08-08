package chapter10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Thesaurus {
	private Map<String, Set<String>> thesaurusMap;

	public Thesaurus() {
		thesaurusMap = new HashMap<>();
	}

	// Returns all synonyms of the word as a Set
	// Returns null if there is no such word
	public Set<String> get(String word) {
		return thesaurusMap.get(word);
	}

	// Returns all key words in this thesaurus as a Set
	// Returns an empty set if there are no keys
	public Set<String> keys() {
		return thesaurusMap.keySet();
	}

	// Adds 'synonym' to the synonym set of 'word'
	public void put(String word, String synonym) {
		thesaurusMap.computeIfAbsent(word, k -> new HashSet<>()).add(synonym);
	}
}
