
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="geeksforgeeks";
		firstNonRepeatingCharacter(str.toLowerCase());
		firstNonRepeatingCharacterInOneTraversal(str.toLowerCase());

	}

	private static void firstNonRepeatingCharacterInOneTraversal(String lowerCase) {
		// TODO Auto-generated method stub
		
	}

	private static void firstNonRepeatingCharacter(String str) {
		// TODO Auto-generated method stub
		
		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(count[str.charAt(i)-'a']==1)
			{
				System.out.println(">>>>>>>>>>  First Non repeating character: "+str.charAt(i));
				break;
			}
		}
	}

}
