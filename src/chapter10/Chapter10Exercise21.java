package chapter10;

import java.util.Set;

public class Chapter10Exercise21 {
	public static void main(String[] args) {
		Thesaurus t = new Thesaurus();
		t.put("fast", "speedy");
		t.put("fast", "swift");
		t.put("slow", "sluggish");

		Set<String> synonyms = t.get("fast");
		System.out.println("Synonyms of 'fast': " + synonyms);

		Set<String> keys = t.keys();
		System.out.println("Key words in the thesaurus: " + keys);
	}
}
