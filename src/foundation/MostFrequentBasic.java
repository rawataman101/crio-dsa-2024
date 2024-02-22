package foundation;

import java.util.*;
import java.util.Map.Entry;

public class MostFrequentBasic {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Object[] ans = mostFrequent(s);
        System.out.println(ans[0] + " " + ans[1]);
    }

    // TODO: Implement this method
    static Object[] mostFrequent(String s) {
    	Map<Character, Integer> map = new HashMap<>();
    	for(char i : s.toCharArray()) {
    		if(!map.containsKey(i)) {
    			map.put(i, 1);
    		} else {
    			map.put(i, map.get(i)+1);
    		}
    	}
    	char max = ' ';
    	int maxValue = 0;
    	for(Entry<Character, Integer> i : map.entrySet()) {
    		if(i.getValue() > maxValue || (maxValue == i.getValue() && max > i.getKey())) {
    			max = i.getKey();
    			maxValue = i.getValue();
    		}
    	}
    	return new Object[]{max, maxValue};
    }
}

