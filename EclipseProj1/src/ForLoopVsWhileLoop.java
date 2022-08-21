
public class ForLoopVsWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++) { 
			// More organized -> (declaration/condition/incremation)
			System.out.println("Hello World");
		}
		
		int a = 0;
		
		while(a < 5) {
			// Less organinized -> the things in the while loop are everywhere.
			System.out.println("Hello World");
			a++;
		}
	}

	
}
