import java.util.Scanner;

public class MultiLineInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		while (s.hasNextLine()) {

			Scanner lineScanner = new Scanner(s.nextLine());

			while (lineScanner.hasNext()) {
				String name = lineScanner.nextLine();

				System.out.println(name);
				
			}
		}
		/*
		 * for(int i=0;i<name.length();i++) { name.replace("->","."); }
		 */
	}

}
