import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a palavra: ");
        String input = scanner.nextLine();
        System.out.println(numberOfAnagrams(input));
    }

    public static int numberOfAnagrams(String word){

        HashMap<Integer, List<String>> map = createSubstrings(word);

        int totalOfAnagrams = 0;
        for(int i = 1; i < word.length(); i++){
            totalOfAnagrams += anagramsInTheList(map.get(i));
        }

        return totalOfAnagrams;
    }

    private static HashMap<Integer, List<String>> createSubstrings(String word){

        HashMap<Integer, List<String>> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            for(int j = i+1; j <= word.length(); j++){
                String subString = sortString(word.substring(i, j));
                List<String> list = map.get(subString.length());
                if(list == null){
                    list = new LinkedList<>(List.of(subString));
                    map.put(subString.length(), list);
                }else{
                    list.add(subString);
                    map.put(subString.length(), list);
                }
            }
        }

        return map;
    }

    private static int anagramsInTheList(List<String> list){
        int total = 0;
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    total += 1;
                }
            }
        }

        return total;
    }

    private static String sortString(String word){
        char[] tempArray = word.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
