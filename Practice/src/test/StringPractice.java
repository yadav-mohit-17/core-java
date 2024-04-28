package test;

public class StringPractice {
	public static void main(String[] args) {
		String str ="Mohit Kumar";
		String word=str;
		String removeSpace=word.replace(" ", "");
		
//		// Remove Space
//		System.out.println("After Remove Space :"+word.replaceAll(" ", ""));
//		
//		// Print ASCII Value
//		for(int i=0;i<word.length();i++) {
//			char ch=word.charAt(i);
//			System.out.println(ch +"=> "+ (int)ch);
//		}
//		
//		// Reverse String
//		System.out.print("After Reverse :");
//		for(int i=word.length()-1;i>=0;i--) {
//			System.out.print(word.charAt(i));
//		}	
		
//		 Reverse String words
//		System.out.println();
//		String[] words =word.split(" ");
//		for(int i=0;i<words.length;i++) {
//			String wor=words[i];
//			for(int j=wor.length()-1;j>=0;j--) {
//				System.out.print(wor.charAt(j));
//			}
//		}
//		
//		//Change The Position of Words from string
//		System.out.println();
//		for(int i=words.length-1;i>=0;i--) {
//			System.out.print(words[i]+" ");
//		}
		
        //mix characters position of String Ex :MohitKumar=> MKouhmiatr	

		String words[]=word.split(" ");
		String s1="",s2="";		
		
		for(int i=0;i<words.length-1;i++) {
			s1=words[i];
			s2=words[i+1];
		}
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		char ch[]=new char[ch1.length+ch2.length];
		int index=0;
		for(int i=0;i<ch.length;i++) {
			ch[index]=ch1[i];
			index++;
			ch[index]=ch2[i];
			index++;
		}
		System.out.println(ch);
	}

}
