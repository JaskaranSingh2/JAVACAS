// BREAK statement instructs the control to TERMINATE the loop

// CONTINUE statement instructs the control to 
// SKIP the execution of the current iteration only.

public class BreakAndContinueInLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			if(i==2) continue;
			System.out.println(i);
		}
		for(int i=0;i<5;i++) {
			if(i==2) break;
			System.out.println(i);
		}

		
		
	}

}
