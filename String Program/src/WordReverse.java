import java.util.Scanner;
import java.util.StringTokenizer;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love my India";

		while (true) {
			System.out.println("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			switch (a) {
			case 1:
				reverseWord(str, str.length());
				break;
			case 2:
				reverseWithStringTokenizer(str);
				break;
			case 3:
				reverseWithSplitArray(str);
				break;
			}
		}

	}

	private static void reverseWithSplitArray(String str) {
		// TODO Auto-generated method stub
		String result = "";
		String wordArray[] = str.split(" ");
		for (int j = wordArray.length - 1; j >= 0; j--) {
			result = result + wordArray[j] + " ";
		}
		System.out.println(result);
	}

	private static void reverseWithStringTokenizer(String str) {
		// TODO Auto-generated method stub
		String[] wordArray = new String[str.length()];
		int i = 0;
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreElements()) {
			wordArray[i] = st.nextToken();
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(wordArray[j] + " ");
		}
	}

	private static void reverseWord(String str, int size) {
		// TODO Auto-generated method stub
		int counter = 0, j = 0;
		while (size >= 0) {
			size--;
			counter++;

			if (size == -1 || str.charAt(size) == ' ') {
				System.out.print(str.substring(size + 1, size + counter) + " ");
				counter = 0;

			}

		}
	}

}
