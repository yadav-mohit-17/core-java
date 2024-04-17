//write a program to count occurance of characters in String

package test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class CharOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");	//Mohit
		String str=sc.nextLine();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		char []chars=str.toCharArray();
		for(Character ch : chars) {
			if(! map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				int cnt=map.get(ch);
				map.put(ch, cnt+1);
			}
		}
		System.out.println(map);
		sc.close();
	}
}
