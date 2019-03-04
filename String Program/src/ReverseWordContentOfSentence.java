
public class ReverseWordContentOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I love my india";
		reverseWordsContent(str,str.length());
	}

	private static void reverseWordsContent(String str, int length) {
		// TODO Auto-generated method stub
		
		String wordArray[]=str.split(" ");
		String result="";
		for(int i=wordArray.length-1;i>=0;i--)
		{
			String revWord=wordArray[i];
			result+=reverse(revWord.toCharArray(),revWord.length()-1,0)+" ";

		}
		System.out.println(result);
	}

	private static String reverse(char[] revWord, int end,int start) {
		// TODO Auto-generated method stub
		
		if (end < start)
			return new String(revWord);
		char temp = revWord[end];
		revWord[end] = revWord[start];
		revWord[start] = temp;
		return reverse(revWord, end - 1, start + 1);
	}

}
