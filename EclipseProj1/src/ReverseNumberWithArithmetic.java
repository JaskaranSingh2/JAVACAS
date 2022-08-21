
public class ReverseNumberWithArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2345, reverse = 0;
		
		for (int i = 0; number != 0; i++) {
			
			int digit = number % 10;
			
			reverse = reverse * 10 + digit;
			
			number = number / 10;
		}
		System.out.println(reverse); 
	}

}
