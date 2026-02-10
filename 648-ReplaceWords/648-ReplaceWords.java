// Last updated: 2/10/2026, 3:15:06 PM
class Solution {
    class Trie{
		class Node{
			char ch;
			String isterminal;
			HashMap<Character, Node> child;
			public Node(char c) {
				this.ch = ch;
				child = new HashMap<>();
			}
		}
		private Node root = new Node('*');
		public void insert(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} 
				else {
					Node nn = new Node(ch);
					curr.child.put(ch, nn);
					curr = nn;
				}
			}
			curr.isterminal = word;

		}
		public String search(String word) {
			Node curr = root;
			for(int i = 0; i<word.length(); i++) {
				char ch = word.charAt(i);
				if(curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
					if(curr.isterminal != null) {
						return curr.isterminal;
					}
				}
				else {
					return word;
				}
			}
			return word;
		}
	}
    public String replaceWords(List<String> dict, String sentence) {
        Trie t = new Trie();
		for(String s : dict) {
			t.insert(s);
		}
		String[] arr = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(t.search(s) + " ");
		}
        int n = sb.length();
		return sb.toString().substring(0, n-1);
    }
}