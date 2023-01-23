package string;

import java.util.HashMap;
import java.util.Map;

public class Firstnonrepeatingcharacter {

	public static void main(String[] args) {
		String s1="aabbddee";
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length();i++) {
			Character currentchar=s1.charAt(i);
			if(map.containsKey(currentchar)==false) {
				map.put(currentchar, 1);
			}
			else{
				int currentfreq=map.get(currentchar);
				currentfreq++;
				map.put(currentchar, currentfreq);
			}
		}
		boolean norepeatingfound=false;
		for(int i=0;i<s1.length();i++) {
			Character currentchar=s1.charAt(i);
			int currentfreq=map.get(currentchar);
             if(currentfreq==1) {
            	 System.out.println(currentchar);
            	 norepeatingfound=true;
            	 break;
             }
		}
		if(norepeatingfound==false) {
			System.out.println(-1);
		}

	}

}
