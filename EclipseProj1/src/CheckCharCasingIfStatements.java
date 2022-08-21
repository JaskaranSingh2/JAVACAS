import java.util.Scanner;

public class CheckCharCasingIfStatements {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letter;
		Scanner asksforletter = new Scanner(System.in);
		System.out.println("Type in 1 character to check if it's uppercase or lowercase");
		letter = asksforletter.next().charAt(0);
		asksforletter.close();
		
		if(Character.isUpperCase(letter)) {
			System.out.println("This letter is UPPERCASE");
		}
		else {
			System.out.println("This letter is lowercase");
		}
	}

}
