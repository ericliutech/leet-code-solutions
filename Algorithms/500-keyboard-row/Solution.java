public class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> found = new ArrayList<>();
        
        HashMap<Character, Integer> rowMap = new HashMap<>();
        rowMap.put('q', 1);
        rowMap.put('w', 1);
        rowMap.put('e', 1);
        rowMap.put('r', 1);
        rowMap.put('t', 1);
        rowMap.put('y', 1);
        rowMap.put('u', 1);
        rowMap.put('i', 1);
        rowMap.put('o', 1);
        rowMap.put('p', 1);
        
        rowMap.put('a', 2);
        rowMap.put('s', 2);
        rowMap.put('d', 2);
        rowMap.put('f', 2);
        rowMap.put('g', 2);
        rowMap.put('h', 2);
        rowMap.put('j', 2);
        rowMap.put('k', 2);
        rowMap.put('l', 2);
        
        rowMap.put('z', 3);
        rowMap.put('x', 3);
        rowMap.put('c', 3);
        rowMap.put('v', 3);
        rowMap.put('b', 3);
        rowMap.put('n', 3);
        rowMap.put('m', 3);
        
        for (String curr : words){
            boolean isRowChanged = false;
            int row = rowMap.get(Character.toLowerCase(curr.charAt(0)));
            
            for (int i = 1; i < curr.length(); i++){
                if (rowMap.get(Character.toLowerCase(curr.charAt(i))) != row){
                    isRowChanged = true;
                    break;
                }
            }
            
            if (!isRowChanged) {
                found.add(curr);
            }
        }
        
        return found.toArray(new String[found.size()]); 
    }
}