import java.util.HashMap;
import java.util.Map;

public class Maps {

    String[] strings;

    public Maps(String[] strings){
        this.strings = allSwap(strings);
    }

    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set
    the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
     */
    public Map<String, String> mapBully(Map<String, String> map){
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting
    later, but for this problem the value is simply 0.
     */
    public Map<String, Integer> word0(String[] strings){
        Map<String, Integer> map = new HashMap<>();
        for(String s : strings){
            map.put(s, 0);
        }
        return map;
    }

    /*
    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true
    if that string appears 2 or more times in the array.
     */
    public Map<String, Boolean> wordMultiple(String[] strings){
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, true);
            } else
                map.put(string, false);
        }
        return map;
    }

    /*
    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return
    the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2
    strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map,
    this can be solved making just one pass over the array. More difficult than it looks.
     */
    public String[] allSwap(String[] strings){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            if(map.containsKey(strings[i].charAt(0))){
                String temp = strings[map.get(strings[i].charAt(0))];
                strings[map.get(strings[i].charAt(0))] = strings[i];
                strings[i] = temp;
                map.remove(strings[i].charAt(0));
            }
            else
                map.put(strings[i].charAt(0), i);
        }
        return strings;
    }
}
