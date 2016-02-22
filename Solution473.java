public class WordDictionary {

    // Adds a word into the data structure.
    public List<String> words = new ArrayList<String>();
    
    public void addWord(String word) {
        // Write your code here
        if(word == null) {
            return;
        }
        
        words.add(word);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        // Write your code here
        if(word == null) {
            return false;
        }
        
        for(int i = 0; i < words.size(); i++) {
            if(words.get(i).length() != word.length()) {
                continue;
            }
            char[] targetChar = word.toCharArray();
            char[] dictionaryChar = words.get(i).toCharArray();
            for(int j = 0; j < word.length(); j++) {
                if(targetChar[j] == '.' || targetChar[j] == dictionaryChar[j]) {
                    if(j == (word.length() - 1)) {
                        return true;
                    }
                    continue;
                } else {
                    break;
                }
            }
        }
        return false;
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
