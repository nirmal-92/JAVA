import java.util.Arrays;
import java.util.Scanner;

class Anagram{
	public static void main(String args[]){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the First String:");
			String a = sc.nextLine();

			System.out.println("Enter the Second String:");
			String b = sc.nextLine();

			if(a.length() == b.length()){
				char[] charArray1 = a.toCharArray();
				char[] charArray2 = a.toCharArray();

				Arrays.sort(charArray1);
				Arrays.sort(charArray2);

				boolean Result = Arrays.equals(charArray1, charArray2);
				
				if(Result){
					System.out.println(a + " and " + b + " are Anagrams");
				}
				else{
					System.out.println(a + " and " + b + " are not Anagrams");
				}
			}
			else{
				System.out.println(a + " and " + b + " are not Anagrams");
			}
		}
		
	}
}