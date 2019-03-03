
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		String result = reverseString(str.toCharArray(), str.length() - 1, 0);
		System.out.println(result);
	}

	private static String reverseString(char[] str, int end, int start) {
		// TODO Auto-generated method stub
		if (end < start)
			return new String(str);
		char temp = str[end];
		str[end] = str[start];
		str[start] = temp;
		return reverseString(str, end - 1, start + 1);

	}

}
